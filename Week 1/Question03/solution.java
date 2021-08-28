import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
for (int i = 0; i <= n; i++) {
          int evenNos = i*2;
          if (evenNos%3==0) {
              sum = sum+evenNos;
              
          }
      }
      System.out.println(sum);
 }
}
