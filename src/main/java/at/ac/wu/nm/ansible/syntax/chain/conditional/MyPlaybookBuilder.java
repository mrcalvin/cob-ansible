package at.ac.wu.nm.ansible.syntax.chain.conditional;

import at.ac.wu.nm.ansible.syntax.chain.IChainableConditions;
import at.ac.wu.nm.ansible.syntax.chain.PlaybookBuilder;

/*// extProduct //*/
public final class MyPlaybookBuilder
  extends    PlaybookBuilder
  implements IChainableConditions<MyPlaybookBuilder> {

  @Override
  public MyPlaybookBuilder getBuilder() {
    return this;
  }
  
  public static MyPlaybookBuilder Playbook() {
    return new MyPlaybookBuilder();
  }
}
/*// end //*/
