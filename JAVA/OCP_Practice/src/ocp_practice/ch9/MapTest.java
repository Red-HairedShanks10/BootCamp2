package ocp_practice.ch9;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map = Map.ofEntries(
                Map.entry("George","555-555-5555"),
                Map.entry("Saul","554-565-7555"),
                Map.entry("Luffy","556-556-5656")
        );
        Map<String, String> map2 = Map.copyOf(map);

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println("map1 keys: " + key + " " +  map.get(key));
        }

        Set<String> keys2 = map2.keySet();
        for(String key : keys2){
            System.out.println("map2 keys: " + key + " " +  map2.get(key));
        }



        //HashMaps
        System.out.println("TreeMap animals: ");
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Panda", "bamboo");
        hashMap.put("Tiger", "horse");
        hashMap.put("horse", "hay");
        String foodHash = hashMap.get("Panda");
        for (String key: hashMap.keySet()){
            System.out.println("a " + key + " eats " + hashMap.get(key));
            if(key.equals("Tiger")){
                System.out.println("Rip  horse :(");
            }
        }
        System.out.println("///////////////");

        //TreeMaps
        System.out.println("TreeMap animals: ");
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("koala", "bamboo");
        treeMap.put("lion", "giraffe");
        treeMap.put("giraffe", "leaf");
        String foodTree = treeMap.get("lion");
        for (String key: treeMap.keySet()){
            System.out.println("a " + key + " eats " + treeMap.get(key));

            if(key.equals("lion")){
                System.out.println("Rip Giraffe :(");
            }
        }

        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));//will be false...

        System.out.println(treeMap.size());
        treeMap.clear();
        System.out.println(treeMap.size());
        System.out.println(treeMap.isEmpty());

    }
}
