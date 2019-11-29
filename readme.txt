|-- seven.principle 设计模式的七大原则

|-- singletonPattern 单例模式
	|--copy 手写练习熟练度程序
	|--doublecheck 双重检查的懒加载单例模式
	|--staticInnerClass 静态内部类实现单例模式
	|--enums：枚举实现单例模式
	
|-- factoryPattern
	|--simpleFactory 简单工厂模式
	|--multipleFactory,multipleFactory2 多工厂扩展
	|--factoryMethod 工厂方法模式
	|--abstractFactory 抽象工厂模式

|-- template_method 模板方法模式

|-- builder 建造者模式

|-- proxy 代理模式
	|-demo01,
	|-demo02,
	|-demo03,
	|-demo04,
	|-demo05,
	|-demo06,
	|-demo07, 模仿Spring AOP框架
	|-demo08,headfirst.proxy中对proxy的解释(远程RMI代理) 

|-- prototype 原型模式
	|-demo01, 当我们需要在多次循环内部创建多个对象，不妨考虑通过clone方法从内存中直接拷贝一个新对象，
				对象中不通部分在循环内部处理，效率会高很多，前提就是这个待拷贝对象实现标识接口Cloneable，并重写Object.clone()
				,因为Object中的clone()方法是protected，非java.lang包中成员是访问不到的。
	|-demo02, 浅层拷贝问题(引用)

|--mediator 中介者模式
	|-demo05,中介者模式完美版.
	
	|-demo01, 未使用中介者实现的经销存管理系统业务逻辑
	|-demo01.copy, 改写的，没写好
	|-demo02, 真正的中介者模式
	|--demo02.copy, 有设计缺陷的中介者模式

|--command 命令模式(不是很好)





|--adapter  适配器模式

|--bridge  桥接模式




|--iterator_ch2016101601 演示的是正常思维人的设计
   |--java 演示的是使用java中设计的迭代器来改造我们的设计