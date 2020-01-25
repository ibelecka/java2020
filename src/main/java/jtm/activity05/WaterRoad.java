package jtm.activity05;
import jtm.activity04.Road;

public class WaterRoad extends Road {


	public WaterRoad() {
		// TODO Auto-generated constructor stub
	}



	public WaterRoad(String from, String to, int distance) {
		super(from, to, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return  "WaterRoad "+ super.getFrom() + " — " + super.getTo() + ", " + super.getDistance() + "km";
	}

}
