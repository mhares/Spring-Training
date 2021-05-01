package spring.core.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load spring configuration file
        ClassPathXmlApplicationContext context =
                                      	new	ClassPathXmlApplicationContext("beanScope-applicationContext.xml");		
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
        
		// check if they are the same
		boolean result = (theCoach==alphaCoach);
		
		// print the result 
		System.out.println("Poiniting to the same object : " + result);
		System.out.println("Memory location for theCoach :" + theCoach);
		System.out.println("Memory location for alphaCoach  :" + alphaCoach);
		
		// close the context
		context.close();
		

	}

}
