package at.ac.wu.nm.ansible.syntax.chain;

import at.ac.wu.nm.ansible.model.Play;
import at.ac.wu.nm.ansible.model.Task;


public interface IChainableBase<A> 
  extends IPlaybookBuilder {
  
  /* required interface */
  A getBuilder();
  
  /* provided interface */
  default A play() {
    /* eager construction */
    Play p = new Play();
    setCurrent(p);
    get().add(p);
    return getBuilder();
  }
  
  default A task(String name) {
    if (getCurrent() != null) {
      getCurrent().add(new Task(name));
    }
    return getBuilder();
  }
  
}

