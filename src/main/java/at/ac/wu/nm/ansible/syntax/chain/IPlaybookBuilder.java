package at.ac.wu.nm.ansible.syntax.chain;

import at.ac.wu.nm.ansible.model.Play;
import at.ac.wu.nm.ansible.model.Playbook;

public interface IPlaybookBuilder {
  
  /* required interface */
  
  void setCurrent(Play p);
  Play getCurrent();
  
  void set(Playbook b);
  Playbook get();
}
