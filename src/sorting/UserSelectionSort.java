package sorting;

public class UserSelectionSort {

    public static void main(String[] args) {
        int [] array = {10, 7, 9, 5, 2,11,6,3};
        // 2,7,9,5,10,11,6,3
        // 2,7,9,5,10,11,6,3
        // 2,3,5,9,10,11,6,7
        // 2,3,5,6,10,11,9,7
        // 2,3,5,6,7,11,9,10
        // 2,3,5,6,7,9,11,10
        // 2,3,5,6,7,9,10,11

        //Outer loop
        for(int i=0; i<array.length-1; i++){
            int min = i;
            //Inner loop
            for(int j=i+1; j< array.length; j++)
                //comparing
                if (array[j] < array[min])
                    min = j;
                //swapping
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;

        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }

    }
}
