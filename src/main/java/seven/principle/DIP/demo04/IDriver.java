package seven.principle.DIP.demo04;

/**
 *	在IDriver中，通过传入ICar接口实现了抽象之间的依赖关系，Driver实现类也传入了ICar接口，至于到底是哪个型号的Car需要在高层模块中声明。
 *
 */
public interface IDriver {
	//是司机就应该会驾驶汽车 
	public void drive(ICar car); 

}
