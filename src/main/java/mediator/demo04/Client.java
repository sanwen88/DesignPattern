package mediator.demo04;

/**@author sanwen88  
 * @date 2019年10月16日 上午9:49:16 
 *
 * @Description: 没有使用中介者模式设计以下案例：修改类A的数时，将这个数字乘以100赋给类B，而修改类B时，要将数除以100赋给类A。
 * 	类A类B互相影响，就称为同事类。
 * 
 * 	这个案例中，类A类B通过直接的关联发生关系，假如我们要使用中介者模式，类A类B之间则不可以直接关联，他们之间必须要通过一个中介者来达到关联的目的
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		AbstractColleague collA = new ColleagueA();
		AbstractColleague collB = new ColleagueB();
		
		System.out.println("==========设置A影响B==========");
		collA.changeNumber(100, collB);//collA与collB关联了
		System.out.println("collA的number值："+collA.getNumber());
		System.out.println("collB的number值："+collB.getNumber());
		
		System.out.println("==========设置B影响A==========");
		collB.changeNumber(8888, collA);//collB与collA关联了
		System.out.println("collB的number值："+collB.getNumber());
		System.out.println("collA的number值："+collA.getNumber());
	}

}
