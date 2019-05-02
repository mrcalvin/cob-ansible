package at.ac.wu.nm.ansible.syntax.strategy;

import java.util.ArrayList;
import java.util.List;

import at.ac.wu.nm.ansible.model.Task;

public class TaskBuilder {
  private String name;
  private PlayBuilder parent;
  private List<ShellBuilder> builders;
  
	public TaskBuilder	(String name, PlayBuilder parent) {
	  this.name = name;
	  this.parent = parent;
	  builders = new ArrayList<ShellBuilder>();
	}
	
	public Task	get() {
		return new Task(this.name);
	}
	
	public PlayBuilder getOwningPlay() {
    return this.parent;
  }
	
	public ShellBuilder shell(String cmdLine, ShellBuilder builder) {
	  builder.setCmdLine(cmdLine);
	  builder.setTask(this);
	  builders.add(builder);
	  return builder;
	}
	
	public ShellBuilder shell(String cmdLine) {
    return shell(cmdLine, Builtin.Shell());
    
	} 
}
