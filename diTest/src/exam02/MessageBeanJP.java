package exam02;

public class MessageBeanJP implements MessageBean {

	@Override
	public void sayHello(String name) {
		System.out.println("ごんにちわ "+name+"さま !");
	}

}
