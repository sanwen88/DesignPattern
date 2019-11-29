package seven.principle.DIP.demo02;

public class WeChat implements IReceiver {

	@Override
	public String getInfo() {
		return "微信信息：Hello WeChat";
	}

}
