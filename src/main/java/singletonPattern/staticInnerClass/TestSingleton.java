package singletonPattern.staticInnerClass;

public class TestSingleton {
	
	public TestSingleton() {
		System.out.println("构造函数");
	}
	
	public static String getNames() {
		return InnerClassTest.name;
	}
	
	public static class InnerClassTest{
		public InnerClassTest() {
			System.out.println("内部类构造函数");
		}
		
		public static final String name = "zjw";
	}

}
