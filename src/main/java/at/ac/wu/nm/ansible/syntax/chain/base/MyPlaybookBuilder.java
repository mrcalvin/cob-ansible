package at.ac.wu.nm.ansible.syntax.chain.base;

import at.ac.wu.nm.ansible.syntax.chain.IChainableBase;
import at.ac.wu.nm.ansible.syntax.chain.PlaybookBuilder;

/*// core //*/
public final class MyPlaybookBuilder 
  extends PlaybookBuilder 
  implements IChainableBase<MyPlaybookBuilder> {
  
 
  public static MyPlaybookBuilder Playbook() {
    return new MyPlaybookBuilder();
  }

  @Override
  public MyPlaybookBuilder getBuilder() {
    return this;
  }

}
/*// end //*/