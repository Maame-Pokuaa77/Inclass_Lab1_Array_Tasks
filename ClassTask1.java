import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ClassTask1 {
    public static void main(String[]args){
        int[]num = {2,5,8,3,4,6,10,15,20,1,11};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to search for:");
        int value = input.nextInt();

        //Identify index given a value
        
        boolean isFound = false;
        int index =0;
        for (int n : num){
            if (value == n){
                System.out.println("Index of the value you searched is:" + index);
                isFound = true;
            }
            index++;




        }
        if (!isFound) {
            System.out.println("Number not found");
        }



        //Swap two values in an array
        int swap1;
       swap1 = num[0];

        int swap2;
       swap2=num[1];
       num[1] = swap1;
       num[0] = swap2;


        System.out.println("Array after swapping:"+Arrays.toString(num));

       //Sort an array in ascending order

        Arrays.sort(num);
        System.out.println("Ascending order:"+Arrays.toString(num));

        Integer[] numbers = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};
        // Sort an array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(numbers));

        //linear search
        boolean isExist = false;
        for (int i = 0; i< num.length ;i ++){
            if (num[i]==value){
                System.out.println("The index of"+ " "+value + " "+"is:" +i);
                isExist = true ;

            }
        }
        if (!isExist){
            System.out.println("The number you entered doesn't exist");
        }

        //binary search
        //Before binary search you need to sort it
        int firstIndexValue = 0;
        int lastIndexValue  = num.length - 1;

        while (lastIndexValue >= firstIndexValue ){
            int midIndexValue = (firstIndexValue + lastIndexValue )/ 2;
            if (value < num[midIndexValue]){
                lastIndexValue = midIndexValue - 1;
            }
            else if (value == num[midIndexValue]){
                int valIndex = midIndexValue;
                System.out.println("The index of the value is:"+valIndex);
                break;
            }
            else {
                firstIndexValue =midIndexValue +1;
            }



        }












        input.close();
    }
}