package ds;

import java.util.*;

public class UseMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("USA", "NY");
        map.put("Canada", "Toronto");
        map.put("BD", "Dhaka");
        map.put("Japan", "Tokyo");

        for(Map.Entry state:map.entrySet()){

            System.out.println(state.getKey()+ " " + state.getValue());

        }

        System.out.println();

        Map<String, String> mapOrder = new LinkedHashMap<>();
        mapOrder.put("USA", "NY");
        mapOrder.put("Canada", "Toronto");
        mapOrder.put("BD", "Dhaka");

        for(Map.Entry state:mapOrder.entrySet()){

            System.out.println(state.getKey()+ " " + state.getValue());

        }

        Map<Integer, String> number = new HashMap<Integer, String>();
        number.put(1, "Computer");
        number.put(2, "Laptop");

        for(Map.Entry device:number.entrySet()){
            System.out.println(device.getKey()+ " "+ device.getValue());
        }
    }
}
