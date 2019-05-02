package at.ac.wu.nm.ansible.syntax.chain.restricted;

import at.ac.wu.nm.ansible.syntax.chain.IChainableConditions;
import at.ac.wu.nm.ansible.syntax.chain.PlaybookBuilder;

/*// censor1 //*/
public final class MyPlaybookBuilder 
  extends PlaybookBuilder 
  implements IChainableConditions<MyPlaybookBuilder> {

/*// end //*/
 
  public static MyPlaybookBuilder Playbook() {
    return new MyPlaybookBuilder();
  }

  @Override
  public MyPlaybookBuilder getBuilder() {
    return this;
  }

/*// censor2 //*/
  
  @Override
  public MyPlaybookBuilder when(String expression) {
    /* throw new UnsupportedOperationException(); */
    return getBuilder();
  }
}
/*// end //*/