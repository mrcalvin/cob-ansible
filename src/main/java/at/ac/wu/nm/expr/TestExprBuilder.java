package at.ac.wu.nm.expr;

import at.ac.wu.nm.expr.model.BooleanOrComparison;
import at.ac.wu.nm.expr.model.Expression;
import at.ac.wu.nm.expr.model.StringLiteral;
import at.ac.wu.nm.expr.model.VariableRef;

public class TestExprBuilder {
  private Expression expr;
  
  /* context variable */
  private VariableRef currentVariable;

  public static TestExprBuilder Test() {
    return new TestExprBuilder();
  }
  
  public static ContextBuilder<String, String> SimpleContext() {
    return new ContextBuilder<String, String>();
  }
  
  public static <K, V>ContextBuilder <K, V>Context() {
    return new ContextBuilder<K, V>();
  }

  public TestExprBuilder() {}

  public TestExprBuilder variable(String varName) {
    this.currentVariable = new VariableRef(varName);
    return this;
  }

  public TestExprBuilder is() {
    if (this.currentVariable != null) {
      /* ... */
    }
    return this;
  }
  
  public TestExprBuilder eq(String value) {
    if (this.currentVariable != null) {
      BooleanOrComparison bc = 
            new BooleanOrComparison(BooleanOrComparison.EQUALS);
      bc.setLeft(this.currentVariable);
      bc.setRight(new StringLiteral(value));
      this.expr = bc;
    }
    return this;
  }
  
  public TestExprBuilder notEq(String value) {
    return this;
  }

  public Expression get() {
    return expr;
  }
}
