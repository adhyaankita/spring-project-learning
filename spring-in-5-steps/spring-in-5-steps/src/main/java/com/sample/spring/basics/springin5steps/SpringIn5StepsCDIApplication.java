package com.sample.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.spring.basics.springin5steps.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

	public static void main(String[] args) {

		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCDIApplication.class)) {
			// SpringApplication.run(SpringIn5StepsCDIApplication.class, args);

			SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
			LOGGER.info("{} dao-{}", business, business.getSomeCDIBusinessDAO());
		}
	}

}
