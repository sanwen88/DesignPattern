package seven.principle.DIP.demo01;

public class Person {
	
	public void receive(Email e) {
		System.out.println(e.getInfo());
	}

}
