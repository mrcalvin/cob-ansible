package at.ac.wu.nm.expr;

import java.util.HashMap;

public class ContextBuilder<K, V> {
    protected final HashMap<K, V> map;

    public ContextBuilder() {
        map = new HashMap<K, V>();
    }
    
    public ContextBuilder<K, V> put(K key, V value) {
      map.put(key, value);
      return this;
    }
    
    public HashMap<K, V> get() {
        return map;
    }
}
