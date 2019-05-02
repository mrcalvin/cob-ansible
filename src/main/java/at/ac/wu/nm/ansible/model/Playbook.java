package at.ac.wu.nm.ansible.model;

import java.util.ArrayList;
import java.util.List;
 
public class Playbook {
 
  private List<Play> plays;
  
  public Playbook() {
    set(new ArrayList<Play>());
  }

  public List<Play> add() {
	  return plays;
  }

  public void add(Play play) {
	  plays.add(play);
  }
  
  public void set(List<Play> newPlays) {
	  plays = newPlays;
  }
  
}