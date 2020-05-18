package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ContructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController"); // Spring creating stereotype-object

		String greeting = myController.sayHello();
		System.out.println(greeting);

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
