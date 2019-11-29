package bridge;

/**
 * @author sanwen88  
 * @date 2019年9月12日 下午4:16:41 
 *
 * @Description: 设计模式：桥接设计模式
 *	桥接模式的引出：实现对不同手机类型(折叠式、直立式)的不同品牌(华为、小米)实现操作编程，比如开/关机、上网、打电话等。
 *	常规设计是这样的：写个IPhone接口，内部定义了开/关机、上网、打电话操作接口，然后定义各种手机类型去实现的实现类，比如直立式Upright类，
 *	最后定义各个品牌的手机(比如Huawei)去继承这个实现类，再在各个品牌手机内部(Huawei类中方法)完善对应各品牌自身操作的一些细节。
 *	需求变动：假如现在又新增了一款Vivo手机，或者新增了一款旋转式手机。前者需求需要给每个手机类型中新增一个Vivo品牌，
 *	后者需求需要给旋转式下面新增各个品牌的具体实现，这些改动都非常的大。
 *	上面这种常人常规设计违背了单一职责原则，需要通过桥接模式进行改进。
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		//获取折叠式手机 (样式 + 品牌 )
		Phone phone1 = new FoldedPhone(new XiaoMi());//折叠式小米手机
		phone1.open();
		phone1.call();
		phone1.close();
		
		System.out.println("----------------------------------");
		
		Phone phone2 = new FoldedPhone(new Vivo());//折叠式Vivo手机
		phone2.open();
		phone2.call();
		phone2.close();
		
		System.out.println("=====================================");
		
		//获取直立式手机 (样式 + 品牌 )
		Phone phone3 = new UpRightPhone(new XiaoMi());//直立式小米手机
		phone3.open();
		phone3.call();
		phone3.close();
		
		System.out.println("-----------------------------------");
		
		Phone phone4 = new UpRightPhone(new Vivo());//直立式Vivo手机
		phone4.open();
		phone4.call();
		phone4.close();
	}

}
