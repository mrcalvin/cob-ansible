package at.ac.wu.nm.ansible.model;

import java.util.ArrayList;
import java.util.List;

public class Task {
  private List<Module> called;
	private String name;
	
	public Task(String name) {
	  this.called = new ArrayList<Module>();
	  this.name = name;
	}
	
}
