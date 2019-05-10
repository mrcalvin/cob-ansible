package at.ac.wu.nm.expr.model;

import java.util.Map;

abstract public class Expression {
    abstract public Object evaluate(Map<String, String> ctx);
}
