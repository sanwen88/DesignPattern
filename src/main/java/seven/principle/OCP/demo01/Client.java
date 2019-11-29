package seven.principle.OCP.demo01;

public class Client {
	
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		Shape s = new Rectangle();
		ge.draw(s);
		
		s = new Circle();
		ge.draw(s);
		
		/*
		 *	现在要开始绘制个三角形 
		 *	1.必须要的操作：
		 *		1.1 扩展个三角形类Triangle
		 *		1.2 构造个三角形对象，然后调用绘图程序绘制动作
		 *	2.不必要的动作：
		 *		绘图程序应该根据传递过来的具体对象，就调用具体对象的绘制逻辑，具体怎么绘制是由具体对象完成，而不应该修改绘图程序自身
		 *		的代码，这就违背了对扩展开放，对修改关闭的OCP原则。请看改善程序案例demo02
		 *	初步猜想实现：GraphicEditor中通过if...else结构，对扩展不利，需要改造。
		 *		1.GraphicEditor提供一个draw()，入参为一个抽象类，抽象类里面定义一个抽象方法-doDraw()
		 *		2.实现类去实现这个抽象类中的doDraw()方法，只有具体实现类知道怎么绘制自己的形状。
		 */
		s = new Triangle();//构造Triangle对象
		ge.draw(s);//调用绘图程序绘制动作
	}

}
