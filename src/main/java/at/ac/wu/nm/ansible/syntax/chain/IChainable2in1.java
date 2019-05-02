package at.ac.wu.nm.ansible.syntax.chain;

/*// extCompInterface //*/
public interface IChainable2in1<A> 
  extends IChainableBase<A>, 
          IChainableConditions<A> {

  /* required interface */
  A getBuilder();

  default A taskWhen(
      String name, 
      String expression) {
    task(name);
    when(expression);
    return getBuilder();
  }
}
/*// end //*/
