package ocp_practice.ch9;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        //HashMaps
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("koala", "bamboo");
        hashMap.put("lion", "meat");
        hashMap.put("giraffe", "leaf");
        String food = hashMap.get("koala");
        for (String key: hashMap.keySet()){
            System.out.print(key + ",");
        }

        //TreeMaps
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("koala", "bamboo");
        treeMap.put("lion", "meat");
        treeMap.put("giraffe", "leaf");
        String food = treeMap.get("koala"); // bamboo
        for (String key: treeMap.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,

    }
}
