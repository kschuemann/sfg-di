package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------------international-bean-----------");
		InternationalizedController internationalizedController = (InternationalizedController) context.getBean("internationalizedController");
		System.out.println(internationalizedController.getGreeting());

		System.out.println("------------primary-bean-----------");
		MyController myController = (MyController) context.getBean("myController"); // Spring creating stereotype-object
		System.out.println(myController.getGreeting());

		System.out.println("--------------property-------------");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------setter--------------");

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------constructor---------------");

		ContructorInjectedController contructorInjectedController = (ContructorInjectedController)context.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}

}
