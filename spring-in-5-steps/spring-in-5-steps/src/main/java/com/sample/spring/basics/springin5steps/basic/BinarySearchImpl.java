package com.sample.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Component
//By Default the scope is singleton
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm1;

	/*
	 * Constructor Injection
	 * @Autowired
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { 
	 * super();
	 * this.sortAlgorithm1 = sortAlgorithm; 
	 * }
	 */

	/*
	 * Setter Injection 
	 * @Autowired
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; 
	 * }
	 */

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		// Implementing Sorting Logic-Bubble Sort, Quick Sort
		// BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		// int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		int[] sortedNumbers = sortAlgorithm1.sort(numbers);
		System.out.println(sortAlgorithm1);
		System.out.println(sortedNumbers);

		// Search an Array

		// Return the index
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("PreDestroy");
	}
}
