package mediator.demo05;

/**@author sanwen88  
 * @date 2019年10月16日 上午9:49:16 
 *
 * @Description: 使用中介者模式设计以下案例：修改类A的数时，将这个数字乘以100赋给类B，而修改类B时，要将数除以100赋给类A。
 * 	类A类B互相影响，就称为同事类。
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		
		//构造具体Mediator，然后调用业务方法，业务方法内部通过mediator执行业务逻辑
		AbstractMediator mediator = new Mediator(collA, collB);
		System.out.println("==========通过设置A影响B==========");
		collA.changeNumber(100, mediator);
		System.out.println(collA.getNumber());
		System.out.println(collB.getNumber());
		
		System.out.println("==========通过设置B影响A==========");
		collB.changeNumber(8888, mediator);
		System.out.println(collB.getNumber());
		System.out.println(collA.getNumber());
	}

}
