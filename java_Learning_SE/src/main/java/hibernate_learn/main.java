package hibernate_learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"zizo");
        map.put(2,"Amro");
        map.put(3,"Yasser");
        map.put(4,"Hatem");
       for(Map.Entry entry:map.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());

       }
        System.out.println(map.keySet().hashCode());
    }
}
