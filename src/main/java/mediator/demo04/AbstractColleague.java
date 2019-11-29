package mediator.demo04;

/**@author sanwen88  
 * @date 2019年10月16日 上午11:24:15 
 *
 * @Description: 抽象一个业务接口类
 *
 * @version V1.0   
 */
public abstract class AbstractColleague {
	protected int number;
	//抽象出一个业务接口方法
	//将场景类中传递给的number赋给collA,colleague赋给collB,collB中的number会被赋值为100*number,反之亦然
	public abstract void changeNumber(int number, AbstractColleague colleague);
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
