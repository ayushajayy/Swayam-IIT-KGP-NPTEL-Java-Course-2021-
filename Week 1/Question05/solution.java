import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it.
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
//Initialize maximum element as first element of the array.  
   //Traverse array elements to get the current max.
   //Store the highest mark in the variable result.
   //Store average mark in avgMarks.
double sum = 0;
        for (int j = 0; j < s; j++) {
            
            sum= arr[j]+sum;

        }
        mark_avg=sum/s;

        int max = arr[0];

        for (int j = 0; j < s; j++) {
            if (arr[j] >= max) {
                max = arr[j];
            }
        }

        result = max;
        System.out.println(result);
        System.out.println(mark_avg);
 }
}
