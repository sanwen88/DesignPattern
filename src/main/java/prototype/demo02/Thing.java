package prototype.demo02;

import java.util.ArrayList;

public class Thing implements Cloneable{
	
	public Thing() {
		System.out.println("-------Thing的构造函数执行了--------");
	}
	
	private ArrayList<String> al = new ArrayList<String>();
	
	@Override
	protected Thing clone() throws CloneNotSupportedException {
		
		return (Thing)super.clone();
		
	}

	public void setValue(String v) {
		this.al.add(v);
	}
	
	public ArrayList<String> getValue(){
		return this.al;
	}
}
