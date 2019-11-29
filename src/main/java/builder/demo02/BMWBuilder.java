package builder.demo02;

import java.util.ArrayList;

import builder.demo01.BMWModel;
import builder.demo01.CarModel;

public class BMWBuilder extends CarBuilder {
	
	BMWModel bmwModel = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> seq) {
		this.bmwModel.setSequence(seq);
	}

	@Override
	public CarModel getModel() {
		return this.bmwModel;
	}

}
