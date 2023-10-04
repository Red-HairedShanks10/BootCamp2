package ocp_exam_practice.ch9;
import java.util.*;
import java.util.function.BiFunction;

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

            if(key.equals("lion") && treeMap.get(key).equals("giraffe")){
                System.out.println("Rip Giraffe :(");
            }
        }

        System.out.println(map.containsKey("lion"));
        System.out.println(map.containsValue("lion"));//will be false...

        System.out.println(treeMap.size());
        treeMap.clear();
        System.out.println(treeMap.size());
        System.out.println(treeMap.isEmpty());

        System.out.println(" ");

        //foreach test
        System.out.println("iterating a map with foreach: ");
        Map<Integer, Character> numChar = new HashMap<>();
       numChar.put(1, 'a');
        numChar.put(2, 'b');
        numChar.put(3, 'c');
        numChar.forEach((k, v) -> System.out.println(k + "-" + v));

        numChar.values().forEach(System.out::println);
        numChar.entrySet().forEach(System.out::println);
        numChar.entrySet().forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));


    }
}


class MapValuesTest{
    public static void main(String[] args) {

        //getting map values
        Map<Character, String> map = new HashMap<>();
         map.put('x', "spot");
         System.out.println("X marks the " + map.get('x'));
         System.out.println("X marks the " + map.getOrDefault('x', ""));
         System.out.println("Y marks the " + map.get('y'));
         System.out.println("Y marks the " + map.getOrDefault('y', ""));

         //replacing Values
        Map<Integer, Integer> mapR= new HashMap<>();
         mapR.put(1, 2);
         mapR.put(2, 4);
         Integer original = mapR.replace(2, 10);
        // System.out.println(original);
         System.out.println(mapR);
         mapR.replaceAll((k, v) -> k + v);
         System.out.println(mapR);

        //putting If Absent
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");//key of Jenny is not updated
        favorites.putIfAbsent("Sam", "Sarr");
        favorites.putIfAbsent("Tom", "Branco");//updated Tom with value("Branco")
        System.out.println(favorites);

        //merging Data
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length()> v2.length() ? v1: v2;
        Map<String, String> myFavs = new HashMap<>();
             myFavs.put("Jenny", "Bus Tour");
             myFavs.put("Tom", "Tram");

            String jenny = myFavs.merge("Jenny", "Skyride", mapper);
            String tom = myFavs.merge("Tom", "Skyride", mapper);
            favorites.put("Sam", null);

            System.out.println(myFavs);
            System.out.println(jenny);
            System.out.println(tom);
            //
        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
        Map<String, String> myFavs2 = new HashMap<>();
        myFavs2.put("Jenny", "Bus Tour");
        myFavs2.put("Tom", "Bus Tour");
        myFavs2.merge("Jenny", "Skyride", mapper2);
        myFavs2.merge("Sam", "Skyride", mapper2);
        System.out.println(myFavs2);

    }
}
