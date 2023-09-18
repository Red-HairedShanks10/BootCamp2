package igbooks.igBook1.lesson7;

import java.util.*;

/*Using Map interface*
 *
 * 
 */

public class MapExample {
    public static void main(String[] args){      
        Map <String, String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Addibas shirt");
        partList.put("H002", "Red-white Nikke shoes");
        
        partList.put("S002", "Black T-Shirt"); // Overwrite value
        Set<String> keys = partList.keySet();
        
       
        for (String key:keys){
             System.out.println("Part#: " + key  );
            System.out.println("Value: " +  " " + partList.get(key));
            
        }
        
        
    }
}
