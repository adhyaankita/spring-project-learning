package com.sample.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIBusinessDAO {

	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}

}
