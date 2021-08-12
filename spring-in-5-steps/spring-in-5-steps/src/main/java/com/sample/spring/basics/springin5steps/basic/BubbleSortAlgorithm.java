package com.sample.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Component
@Service
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// logic for Bubble Sort
		return numbers;
	}

}
