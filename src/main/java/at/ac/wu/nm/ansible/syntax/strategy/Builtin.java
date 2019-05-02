package at.ac.wu.nm.ansible.syntax.strategy;

public class Builtin extends ShellBuilder {

 public static ShellBuilder Shell() {
    return new Builtin();
 }
 
}
