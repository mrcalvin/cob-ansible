package at.ac.wu.nm.ansible.syntax.chain.extcomp;

import at.ac.wu.nm.ansible.syntax.chain.IChainable2in1;
import at.ac.wu.nm.ansible.syntax.chain.PlaybookBuilder;

/*// core //*/
public final class MyPlaybookBuilder 
  extends PlaybookBuilder 
  implements IChainable2in1<MyPlaybookBuilder> {
  
 
  public static MyPlaybookBuilder Playbook() {
    return new MyPlaybookBuilder();
  }

  @Override
  public MyPlaybookBuilder getBuilder() {
    return this;
  }

}
/*// end //*/