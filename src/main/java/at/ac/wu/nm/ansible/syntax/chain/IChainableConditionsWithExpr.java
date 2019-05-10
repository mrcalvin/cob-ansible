package at.ac.wu.nm.ansible.syntax.chain;

import at.ac.wu.nm.expr.TestExprBuilder;

/*// uniInterface1 //*/
public interface IChainableConditionsWithExpr<A> 
extends IChainableBase<A> {
/*// end //*/
  
  /* required interface */
  A getBuilder();

/*// uniInterface2a //*/  
  default A when(TestExprBuilder expression) {
    /* ... */
 /*// end //*/

    if (getCurrent() == null || 
        getCurrent().getTasks().size() == 0) {
      throw new UnsupportedOperationException();        
    } 
    /* get current Task */
    getCurrent().
    getTasks().
    get(getCurrent().getTasks().size()-1);
    /* ... */
/*// uniInterface2b //*/
    return getBuilder();
  }
}
/*// end //*/

