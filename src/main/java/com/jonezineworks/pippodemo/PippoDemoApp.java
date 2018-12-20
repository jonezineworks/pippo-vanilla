package com.jonezineworks.pippodemo;

import ro.pippo.core.Pippo;

public class PippoDemoApp {

	public static void main(String[] args) {
		Pippo pippo = new Pippo(new MyApplication());
		pippo.start();
	}
}
