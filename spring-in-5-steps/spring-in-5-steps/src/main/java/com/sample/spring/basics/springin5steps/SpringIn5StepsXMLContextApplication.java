package com.sample.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.basics.springin5steps.xml.XMLPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {

		// Application Context
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			LOGGER.info("Beans Loaded ->{}", (Object) applicationContext.getBeanDefinitionNames());

			XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getXMLJdbcConnection());
		}
	}
}
