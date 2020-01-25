package jtm.activity05;

import jtm.activity04.Road;
import jtm.activity04.Transport;

class Amphibia extends Vehicle {
	private byte sails;
	private int wheels;
	private Ship ship;

	public Amphibia() {

	}

	public Amphibia(String id, float consumption, int tankSize, byte sails, int wheels) {
		super(id, consumption, tankSize, wheels);
		this.sails = sails;
		ship = new Ship(id, sails);
	}

	@Override
	public String move(Road road) {
		String message;

		if (road instanceof WaterRoad) {
			message = ship.move(road);
		} else {
			message = super.move(road);
		}
		message = message.replaceAll("Vehicle", "Amphibia");
		message = message.replaceAll("Ship", "Amphibia");
		return message;
	}

}
