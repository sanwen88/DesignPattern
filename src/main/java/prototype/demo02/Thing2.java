package prototype.demo02;

import java.util.ArrayList;

public class Thing2 implements Cloneable{
	private ArrayList<String> al = new ArrayList<String>();

	@Override
	protected Thing2 clone() throws CloneNotSupportedException {
		Thing2 t = null;
		t = (Thing2)super.clone();
		//t.al.clone();
		t.al = (ArrayList<String>) this.al.clone();//将源目标对象的al引用对象clone一份赋值给新拷贝的对象t
		return t;
	}
	
	public void setValue(String v) {
		this.al.add(v);
	}
	
	public ArrayList<String> getValue(){
		return this.al;
	}
}
