package seven.principle.DIP.demo04;

/**
 * 接口只是一个抽象化的概念，是对一类事物的最抽象描述，具体的实现代码由相应的实现类来完成，实现类Driver 代码如下
 */
public class Driver implements IDriver {

	// 司机的主要职责就是驾驶汽车
	@Override
	public void drive(ICar car) {
		car.run();
	}

}
