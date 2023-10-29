package org.example.Dictionaries;

public interface Dictionary<K, V> extends Iterable<DictionaryEntry<K, V>>{
     public V put(K key, V value);
     public V get(K key);
     public boolean remove(K key);
     public boolean isEmpty();
     public void clear();

}
