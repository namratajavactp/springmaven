package com.abbank.web.reach.out.world.aop;

public class Advice {
	public void beforeImpl() {
		System.out.println("-------->Me called before calling Bean");
	}
	public void AfterImpl() {
		System.out.println("-------->Me called after  calling Bean");
	}
}


