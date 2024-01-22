package exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("exam01/beans.xml");
		Person p = (Person)context.getBean("p");
		p.hello();
	}

}
