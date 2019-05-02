package at.ac.wu.nm.ansible.syntax.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import at.ac.wu.nm.ansible.model.Play;

public class PlayBuilder {
	private List<TaskBuilder> builders;
	private Play play;
	private PlaybookBuilder parent;
	
	public PlayBuilder(PlaybookBuilder parent) {
		this.parent = parent;
		builders = new ArrayList<TaskBuilder>();
	}
	
	public TaskBuilder task(String name) {
		TaskBuilder tb = new TaskBuilder(name,this);
		builders.add(tb);
		return tb;
	}
	
	public PlayBuilder play() {
		return this.parent.play();
	}
	
	public Play get() {
		if (play != null) {
			Stream<TaskBuilder> str = builders.stream();
			play = new Play();
			play.set(str.map(b -> b.get()).collect(Collectors.toList()));
		}
		return play;
	}
}
