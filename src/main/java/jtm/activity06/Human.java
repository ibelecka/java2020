package jtm.activity06;

import java.lang.*;
import java.util.Arrays;

public class Human implements Humanoid {
	private int weight;
	boolean alive;
	String[] backpack ;

	public Human() {
		this.alive = true;
		this.weight = 42;
		backpack = new String[10];
	}

	public Human(int weight) {
		this.alive = true;
		this.weight = weight;
		backpack = new String[10];
		
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
	public String killHimself() {
		if (this.alive == true) {
			this.alive = false;
			return "Dead";
		}
		return null;
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
		for (int i = 0 ; i < this.backpack.length; i++) {
			if (this.backpack[i] == null) {
				this.backpack[i] = item;
				break;
			}
		}
	}

	@Override
	public String isAlive() {
		if (this.alive == true) {
			return "Alive";
		} else {
			return "Dead";
		}
	}

	public String toString() {
		return this.getClass().getSimpleName() + this.weight + Arrays.toString(this.getBackpack());
	}

}
