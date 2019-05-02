package at.ac.wu.nm.ansible.syntax.chain.restricted;

public interface ICensor<A> {
  A getBuilder();
  default A when(String expression) {
    /* throw new UnsupportedOperationException(); */
    return getBuilder();
  }
}