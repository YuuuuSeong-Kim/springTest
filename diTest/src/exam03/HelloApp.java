package exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("exam03/beans.xml");
		
		MessageBean mb = (MessageBean)context.getBean("mb");
		mb.sayHello("tiger");
	}
}
