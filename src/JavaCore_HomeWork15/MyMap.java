package JavaCore_HomeWork15;

import java.util.*;

public class MyMap<K, V> {
    private K key;
    private V value;
    private Set<MyEntry<K, V>> set;

    public MyMap() {
        set = new HashSet<MyEntry<K, V>>();
    }

    public void removeByKey(K key){
        Iterator<MyEntry<K, V>> iter = set.iterator();
        while(iter.hasNext()) {
            if(iter.next().getKey().equals(key)){
                iter.remove();
            }
        }
    }
}
