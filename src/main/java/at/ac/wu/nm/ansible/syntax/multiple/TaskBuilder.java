package at.ac.wu.nm.ansible.syntax.multiple;

import at.ac.wu.nm.ansible.model.Task;

public class TaskBuilder {
  private String name;
  
	public TaskBuilder	() {}
	
	public Task	get() {
		return new Task(this.name);
	}
}
