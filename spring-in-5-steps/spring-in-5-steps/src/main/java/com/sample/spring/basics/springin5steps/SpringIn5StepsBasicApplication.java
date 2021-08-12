package com.sample.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.spring.basics.springin5steps.basic.BinarySearchImpl;


//@SpringBootApplication
@Configuration
@ComponentScan("com.sample.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// Where to search for beans? => Not Required

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			// SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

			// By default Singleton Bean Scope
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);

			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 5);
			System.out.println(result);
		}
	}
}
