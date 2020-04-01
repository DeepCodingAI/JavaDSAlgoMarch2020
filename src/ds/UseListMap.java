package ds;

import java.util.*;

public class UseListMap {
    public static void main(String[] args) {
        List<String> cityOfUsa = new ArrayList<>();
        cityOfUsa.add("NY");
        cityOfUsa.add("PA");
        cityOfUsa.add("CA");
        cityOfUsa.add("FL");

        List<String> cityOfCanada = new ArrayList<>();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Alberta");
        cityOfCanada.add("Vancouver");

        List<String> cityOfUK = new ArrayList<>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Wales");

        Map<String, List<String>> cityOfWorld = new LinkedHashMap<String, List<String>>();
        cityOfWorld.put("USA", cityOfUsa);
        cityOfWorld.put("Canada", cityOfCanada);
        cityOfWorld.put("UK", cityOfUK);

        for(Map.Entry city:cityOfWorld.entrySet()){
            System.out.println(city.getKey()+ " " + city.getValue());
        }

    }
}
