package jtm.activity09;

/*- TODO #1
 * Implement Comparable interface with Order class
 * Hint! Use generic type of comparable items in form: Comparable<Order>
 * 
 * TODO #2 Override/implement necessary methods for Order class:
 * - public Order(String orderer, String itemName, Integer count) — constructor of the Order
 * - public int compareTo(Order order) — comparison implementation according to logic described below
 * - public boolean equals(Object object) — check equality of orders
 * - public int hashCode() — to be able to handle it in some hash... collection 
 * - public String toString() — string in following form: "ItemName: OrdererName: Count"
 * 
 * Hints:
 * 1. When comparing orders, compare their values in following order:
 *    - Item name
 *    - Customer name
 *    - Count of items
 * If item or customer is closer to start of alphabet, it is considered "smaller"
 * 
 * 2. When implementing .equals() method, rely on compareTo() method, as for sane design
 * .equals() == true, if compareTo() == 0 (and vice versa).
 * 
 * 3. Also Ensure that .hashCode() is the same, if .equals() == true for two orders.
 * 
 */

public class Order implements Comparable<Order> {
	String customer; // Name of the customer
	String name; // Name of the requested item
	int count; // Count of the requested items

	public Order(String orderer, String itemName, Integer count) {
		this.customer = orderer;
		this.name = itemName;
		this.count = count;
	}

	@Override
	public String toString() {
		return this.customer + ": " + this.name + ": " + this.count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (this.compareTo(other) == 0) {
			return true;
		} else {
			return false;
		}
		
		
//		if (count != other.count)
//			return false;
//		if (customer == null) {
//			if (other.customer != null)
//				return false;
//		} else if (!customer.equals(other.customer))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
	}

	@Override
	public int compareTo(Order o) {

		if (this.customer.compareTo(o.customer) != 0) {
			if (this.customer.compareTo(o.customer) > 0) {
				return 1;
			} else if ((this.customer.compareTo(o.customer) < 1)) {
				return -1;
			} else {
				return 0;
			}
		}
		if (this.name.compareTo(o.name) != 0) {
			if (this.name.compareTo(o.name) > 0) {
				return 1;
			} else if ((this.name.compareTo(o.name) < 1)) {
				return -1;
			} else {
				return 0;
			}
		}

		if (this.count != o.count) {
			if (this.count > o.count) {
				return 1;
			} else if (this.count < o.count) {
				return -1;
			} else {
				return 0;
			}
		}

		return 0;
	}

}
