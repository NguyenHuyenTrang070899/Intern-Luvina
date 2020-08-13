package Luvina.Lec5.generic.hashMap;
import java.util.HashMap;
import java.util.Map; 
class Key {
    String key; 
    Key(String key) {
        this.key = key;
    } 
    @Override
    public int hashCode() {
        int hash = (int) key.charAt(0);
        System.out.println("hashCode of key: " + key + " = " + hash);
        return hash;
    } 
    @Override
    public boolean equals(Object obj) {
        return key.equals(((Key) obj).key);
    }
} 
public class hashMapWithKeyOverridedhashCodeAndEquals {
    public static void main(String[] args) {
        Map<Key, Integer> map = new HashMap<>();    // line 1
        map.put(new Key("Putin"), 20);         // line 2
        map.put(new Key("Trump"), 30);         // line 3
        map.put(new Key("Poroshenko"), 40);        // line 4
 
        System.out.println("==================");
        System.out.println("Value of key Putin: " 
                + map.get(new Key("Putin"))); // line 5
        System.out.println("Value of key Poroshenko: " 
                + map.get(new Key("Poroshenko"))); // line 6
    }
}