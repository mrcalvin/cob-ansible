package at.ac.wu.nm.ansible.syntax.chain;

import at.ac.wu.nm.ansible.model.Play;
import at.ac.wu.nm.ansible.model.Playbook;

public abstract class PlaybookBuilder 
  implements IPlaybookBuilder {
    
  /* context variable */  
  private Playbook book;
  
  /* context variable */
  private Play play;
  
  public PlaybookBuilder() {
    this.book = new Playbook();
  } 

  @Override
  public void setCurrent(Play p) {
    this.play = p;
  }

  @Override
  public Play getCurrent() {
    return this.play;
  }

  @Override
  public void set(Playbook b) {
    this.book = b;
    
  }

  @Override
  public Playbook get() {
    return this.book;
  }
  
}
