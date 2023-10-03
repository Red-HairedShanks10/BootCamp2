package ocp_practice.ch9;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        //HashMaps
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,
    }
}
