package seven.principle.OCP.demo02;

public class Client {

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		
		ge.doDraw(new Circle());
		
		ge.doDraw(new Rectangle());
	}

}
