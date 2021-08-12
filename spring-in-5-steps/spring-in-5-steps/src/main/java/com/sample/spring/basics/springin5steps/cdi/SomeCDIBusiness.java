package com.sample.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {

	@Inject
	SomeCDIBusinessDAO someCDIDAO;

	public SomeCDIBusinessDAO getSomeCDIBusinessDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIBusinessDAO(SomeCDIBusinessDAO someCDIBusinessDAO) {
		this.someCDIDAO = someCDIBusinessDAO;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCDIDAO.getData();
		for (int value : data) {
			if(value > greatest)
				greatest = value;
		}
		return greatest;
	}
	

}
