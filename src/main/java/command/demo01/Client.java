package command.demo01;

/**@author sanwen88  
 * @date 2019年10月17日 上午9:29:34 
 *
 * @Description: 未使用命令模式
 *
 * @version V1.0   
 */
public class Client {

	public static void main(String[] args) {
		//开始和需求组沟通
		System.out.println("-------------客户要求增加一个需求-----------------");
		Group group = new RequirementGroup();
		//找到需求组
		group.find();
		//增加一个需求
		group.add();
		//
		group.plan();
		
		//过了段时间,客户发现界面需求需要改变,召唤美工组
		System.out.println("----------客户要求删除一个页面---------");
		Group pageGroup = new PageGroup();
		//找到美工组
		pageGroup.find();
		//要求删除一个需求页面
		pageGroup.delete();
		//
		pageGroup.plan();
		
		//又过来段时间,客户发现数据库设计的有问题,召唤代码组
		System.out.println("----------客户要求某个业务数据库设计有问题---------");
		Group codeGroup = new CodeGroup();
		codeGroup.find();
		//要求更改数据库表的设计
		codeGroup.change();
		codeGroup.plan();
		
		//再过了几天,又发现界面有点问题,把美工组召唤过去......
	}

}
