package jtm.activity06;

public class Martian implements Alien, Humanoid, Cloneable {
	private int weight;
	String[] backpack = new String[10];

	public Martian() {
		this.weight = 0;
	}

	public Martian(int weight) {
		this.weight = weight;
	}

	@Override
	public String killHimself() {
		return this.isAlive();

	}

	@Override
	public int getArmCount() {
		return ARM_COUNT;
	}

	@Override
	public String[] getBackpack() {
		return this.backpack;
	}

	@Override
	public void addToBackpack(String item) {
		for (int i = 0; i < this.backpack.length; i++) {
			if (this.backpack[i] == null) {
				this.backpack[i] = item;
				break;
			}
		}
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;

	}

	@Override
	public void eatHuman(Humanoid humanoid) {
		if (humanoid.isAlive().equals("Alive")) {
			humanoid.killHimself();
			this.weight += humanoid.getWeight();
		}
	}

	@Override
	public int getLegCount() {
		return LEG_COUNT;
	}

	@Override
	public String isAlive() {
		return "I AM IMMORTAL!";
	}

	
	protected Object clone() throws CloneNotSupportedException {

		Martian m = new Martian();
		m.setWeight(this.getWeight());
		return m;
	}
	  
	 

}
