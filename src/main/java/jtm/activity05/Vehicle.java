package jtm.activity05;

import java.util.Locale;

import jtm.activity04.Road;
import jtm.activity04.Transport;

public class Vehicle extends Transport {
	protected int wheels;

	public Vehicle() {
	}

	public Vehicle(String id, float consumption, int tankSize, int wheels) {
		super(id, consumption, tankSize);
		this.wheels = wheels;
	}

	public String move(Road road) {
		String message;
		float fuel = road.getDistance() * this.consumption / 100;
		if (road instanceof WaterRoad) {
			message = "Cannot drive on " + road.toString();
		} else {
			if (fuel < this.fuelInTank) {
				this.fuelInTank -= fuel;
				message = this.getId() + " " + this.getClass().getSimpleName() + " is driving on " + road.toString()
						+ " with " + wheels + " wheels";
			} else {
				message = "Cannot move on " + road.toString() + ". Necessary fuel:"
						+ String.format(Locale.US, "%.2f", fuel) + "l, fuel in tank:"
						+ String.format(Locale.US, "%.2f", this.fuelInTank) + "l";
			}
		}
		return message;
	}

}

