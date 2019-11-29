package command.demo02;

public class DeletePageCommand extends Command {

	// 执行删除一个页面的命令
	@Override
	public void execute() {
		// 找到页面组
		super.pg.find();
		// 删除一个页面
		super.rg.delete();

		// 给出计划
		super.rg.plan();
	}

}
