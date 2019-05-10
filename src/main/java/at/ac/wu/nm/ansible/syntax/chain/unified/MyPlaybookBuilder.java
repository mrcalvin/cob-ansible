package at.ac.wu.nm.ansible.syntax.chain.unified;

import at.ac.wu.nm.ansible.syntax.chain.IChainableConditionsWithExpr;
import at.ac.wu.nm.ansible.syntax.chain.PlaybookBuilder;
import at.ac.wu.nm.expr.TestExprBuilder;

/*// core //*/
public final class MyPlaybookBuilder 
  extends PlaybookBuilder 
  implements IChainableConditionsWithExpr<MyPlaybookBuilder> {
  
 
  public static MyPlaybookBuilder Playbook() {
    return new MyPlaybookBuilder();
  }
  
  public static TestExprBuilder Test() {
    return new TestExprBuilder();
  }

  @Override
  public MyPlaybookBuilder getBuilder() {
    return this;
  }

}
/*// end //*/