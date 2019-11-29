package builder.demo02;

import java.util.ArrayList;

import builder.demo01.BMWModel;
import builder.demo01.BenzModel;

public class Client {

	public static void main(String[] args) {
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine");
		sequence.add("start");
		sequence.add("stop");
		
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz = (BenzModel) benzBuilder.getModel();
		benz.run();
		
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel) bmwBuilder.getModel();
		bmw.run();
	}

}
