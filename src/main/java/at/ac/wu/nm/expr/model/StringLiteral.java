package at.ac.wu.nm.expr.model;

import java.util.Map;

public class StringLiteral extends Expression {
  public String value;
  public StringLiteral(String v) {
    this.value = v;
  }
  @Override
  public Object evaluate(Map<String, String> ctx) {
    // TODO Auto-generated method stub
    return false;
  }
}
