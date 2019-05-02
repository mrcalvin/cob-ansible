package at.ac.wu.nm.ansible.syntax.strategy;

public class Expect extends ShellBuilder {

  public static ShellBuilder Shell() {
      return new Expect(); 
  }
  
  
  public Expect response (String pattern) {
    return this;
  }
  
  public Expect body (String pattern) {
    return this;
  }

}
