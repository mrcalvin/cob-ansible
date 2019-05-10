package at.ac.wu.nm.expr.model;

import java.util.Map;

public class VariableRef extends Expression {
  public String varName;
  
  public VariableRef(String name) {
    this.varName = name;
  }
  @Override
  public Object evaluate(Map<String, String> ctx) {
    return false;
  }

}
