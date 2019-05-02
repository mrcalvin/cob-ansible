package at.ac.wu.nm.ansible.syntax.strategy;

import at.ac.wu.nm.ansible.model.Shell;

public abstract class ShellBuilder {
  
  private String cmdLine;
  private TaskBuilder owningTask;
	
  public ShellBuilder response(String pattern) {
    throw new java.lang.UnsupportedOperationException();
  }
  
  public ShellBuilder body(String script) {
    throw new java.lang.UnsupportedOperationException();
  }
  
  public ShellBuilder(TaskBuilder tb) {
    setTask(tb);
  }
  
  public ShellBuilder() {}
  
	public Shell get() {
		return new Shell();
	}

  public void setCmdLine(String cmdLine) {
    this.cmdLine = cmdLine;
  }
  
  public void setTask(TaskBuilder tb) {
    this.owningTask= tb;
  }
  
  public TaskBuilder task(String name) {
    return this.owningTask.getOwningPlay().task(name);
  }
}
