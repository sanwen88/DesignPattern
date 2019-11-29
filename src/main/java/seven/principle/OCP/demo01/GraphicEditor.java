package seven.principle.OCP.demo01;

/**
 * @author sanwen88  
 * @date 2019年8月28日 下午3:11:30 
 *
 * @Description: 绘图程序
 *
 * @version V1.0
 */
public class GraphicEditor {
	
	public void draw(Shape s) {
		if(s.types ==1) {
			//画圆形
			drawCircle();
		}else if(s.types==2) {
			//画长方形
			drawRectangle();
		}else if(s.types==3) {//扩展了一个画三角形的功能
			drawTriangle();
		}
	}
	
	private void drawCircle() {
		System.out.println("绘制圆形");
	}
	
	private void drawRectangle() {
		System.out.println("绘制长方形");
	}
	
	private void drawTriangle() {
		System.out.println("绘制三角形");
	}
	
}
