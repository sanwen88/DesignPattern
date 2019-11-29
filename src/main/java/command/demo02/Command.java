package command.demo02;

import command.demo01.CodeGroup;
import command.demo01.PageGroup;
import command.demo01.RequirementGroup;

public abstract class Command {
	
	protected RequirementGroup rg = new RequirementGroup();
	
	protected PageGroup pg = new PageGroup();
	
	protected CodeGroup cg = new CodeGroup();
	
	public abstract void execute();

}
