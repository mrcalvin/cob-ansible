package at.ac.wu.nm.ansible.model;

import java.util.ArrayList;
import java.util.List;

public class Play {
	
	private List<Task> tasks;
	private List<String>hosts;
	private String remoteUser;
	
	public Play() {
		set(new ArrayList<Task>());
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void set(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public void add(Task task) {
		tasks.add(task);
	}
}
