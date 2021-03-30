package com.springmaven6;

import java.util.HashMap;

public class Zipi {

	private String a = new Customerhello().getCity();
	private int b = new Customerhello().getZipcode();

	public String getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public HashMap<String, Integer> gett() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("mumbai", 25);
		hm.put("hyderabad", 25);
		hm.put("Kolkata", 25);
		return hm;
	}

}