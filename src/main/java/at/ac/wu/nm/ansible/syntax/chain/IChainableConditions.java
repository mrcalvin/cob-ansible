package at.ac.wu.nm.ansible.syntax.chain;

/*// extInterface //*/
public interface IChainableConditions<A> 
extends IChainableBase<A> {
  /* required interface */
  A getBuilder();

  default A when(String expression) {
    if (getCurrent() == null || 
        getCurrent().getTasks().size() == 0) {
      throw new UnsupportedOperationException();        
    } 
    /* get current Task */
    getCurrent().
    getTasks().
    get(getCurrent().getTasks().size()-1);
    /* ... */
    return getBuilder();
  }
}
/*// end //*/
