package com.mega.mvc08.generic;

public class Truck<T, A> {
	T weight;
	A distance;

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", distance=" + distance + "]";
	}

}
