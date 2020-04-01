package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

    public static void main(String[] args) {
        List<String> list = null;

        list = new LinkedList<String>();
        list.add("NY");
        list.add("PA");
        list.add("FL");

        //Using for loop
        for(int i=0; i<list.size(); i++){
            list.get(i);
        }

        //using Iterator
        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Using for each loop
        for(String st:list){
            System.out.println(st);
        }

        list = new ArrayList<>();
        list.add("NY");
        list.add("PA");
        list.add("FL");

        Iterator it2 = list.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
