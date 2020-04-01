package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseList {
    public static void main(String[] args) {
        List number = new ArrayList();
        number.add(20);
        System.out.println(number.get(0));
        number.add("Value");
        System.out.println(number.get(1));


        List<String> list = new ArrayList<>();
        list.add("NY");
        list.add("PA");
        list.add("FL");

        //Using for loop
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Using Iterator
        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Using for each
        for(String state: list){
            System.out.println(state);
        }
    }
}
