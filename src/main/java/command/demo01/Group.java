package command.demo01;

public abstract class Group {
	
	public abstract void find();
	
	public abstract void add();
	
	public abstract void delete();
	
	public abstract void change();
	
	public abstract void plan();
	
	//每个接收者都要对直接执行的任务可以回滚
	public void rollBack() {
		//根据日志进行回滚
	}

}
