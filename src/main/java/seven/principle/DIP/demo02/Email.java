package seven.principle.DIP.demo02;


public class Email implements IReceiver {

	@Override
	public String getInfo() {
		return "电子邮件信息：Hello Email";
	}

}
