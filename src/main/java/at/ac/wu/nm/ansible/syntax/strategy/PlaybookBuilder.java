package at.ac.wu.nm.ansible.syntax.strategy;

import at.ac.wu.nm.ansible.model.Playbook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlaybookBuilder {
	 private Playbook book;
	 private List<PlayBuilder> plays;
	 private PlayBuilder currentPlayBuilder;
	 
	  public PlaybookBuilder() {
		  plays = new ArrayList<PlayBuilder>();
		  
	  }
	  
	  public static PlaybookBuilder Playbook() {
		  return new PlaybookBuilder();
		 
	  }
	  
	  public PlayBuilder play() {
		  currentPlayBuilder = new PlayBuilder(this);
		  plays.add(currentPlayBuilder);
		  return currentPlayBuilder;
	  }
	  

	  public Playbook get() {
		  if (book == null) {
			  /* (lazy, deferred) construction */
			  Stream<PlayBuilder> str = plays.stream();
			  book = new Playbook();
			  book.set(str.map(pb -> pb.get()).collect(Collectors.toList()));
		  } 
		  return book;
	  }
}
