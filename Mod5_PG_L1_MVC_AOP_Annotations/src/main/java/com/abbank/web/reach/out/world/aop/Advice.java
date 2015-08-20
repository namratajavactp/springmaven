package com.abbank.web.reach.out.world.aop;

import com.abbank.web.reach.out.world.beans.EnrollRequest;

public class Advice {
	public void beforeImpl(EnrollRequest enrollRequest) {
		System.out.println("-------->Me called before calling Bean + " + enrollRequest.getFirstname());
	}
	public void AfterImpl() {
		System.out.println("-------->Me called after  calling Bean");
	}
}


