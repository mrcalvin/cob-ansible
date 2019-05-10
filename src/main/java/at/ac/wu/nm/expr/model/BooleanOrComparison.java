package at.ac.wu.nm.expr.model;

import java.util.Map;

public class BooleanOrComparison extends Expression {
  
  public static final int EQUALS = 1;
  public static final int NOTEQUALS = 2;

  
  private int operator;
  private Expression left;
  private Expression right;
  
  public BooleanOrComparison(int operator) {
    this.operator = operator;
  }
  
  public void setLeft(Expression e) {
    this.left = e;  
  }
  
  public void setRight(Expression e) {
    this.right = e;  
  }
  
  @Override
  public Object evaluate(Map<String, String> ctx) {
    // TODO Auto-generated method stub
    return false;
  }

}
