package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Please enter limit: " );
        int limit = sc.nextInt();
        //System.out.println("Please enter number: " );
        for(int i=0; i<limit; i++){
            list.add(random.nextInt(500));
        }

        for(Integer data:list){
            System.out.println(data);
        }

    }
}
