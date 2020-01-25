package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Ship extends Transport {
	protected byte sails;

	public Ship() {

	}

	public Ship(String id, byte sails) {
		super.setId(id);
		this.sails = sails;
	}

	public Ship(String id, float consumption, int tankSize) {
		super(id, consumption, tankSize);
	}

	@Override
	public String move(Road road) {
		String message;
		if (road instanceof WaterRoad) {
			message = this.getId() + " " + this.getClass().getSimpleName() + " is sailing on " + road.toString()
					+ " with " + sails + " sails";
		} else {
			message = "Cannot sail on " + road.toString();
		}
		return message;
	}
}
