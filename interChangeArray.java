/*
 * Write a Java program to interchange the elements of an array with 
 * the elements of another array without using the third array.If the 
 * array size differs display "Unable to swap size differs".If the range 
 * is lesser or equal to Zero . Display "Invalid range "
 * Assume the maximum size of array is 20
 * 
 *
Sample Input 1: 
Enter the number of elements in the first array :
3
Enter the elements in the first array
1
2
3
Enter the number of elements in the second array :
3
Enter the elements in the second array
4
5
6
Sample Output 1: 
The first array after swapping is :
4 5 6
The second array after swapping is :
1 2 3


Sample Input 2: 
Enter the number of elements in the first array :
-3
Sample Output 2: 
Invalid range

Sample Input 3: 
Enter the number of elements in the first array :
3
Enter the elements in the first array
1
2
3
Enter the number of elements in the second array :
2
Sample Output 3: 
Unable to swap size differs
 *
 */
import java.util.Scanner;
public class interChangeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the first array :");
		int a = sc.nextInt();
		if(a<=0)	
		{
			System.out.println("Invalid range");
			return ;
		}
		int[] a1 = new int[a];
		System.out.println("Enter the elements in the first array");
		for(int i=0; i < a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of elements in the second array :");
		int b = sc.nextInt();
		if(b<=0)	
		{
			System.out.println("Invalid range");
			return ;
		}

		if(b!=a) {
			System.out.println("Unable to swap size differs");
		}
		else {
			System.out.println("Enter the elements in the second array");
			int[] b1 = new int[a];
			for(int i=0; i < b1.length;i++) {
				b1[i]=sc.nextInt();
			}
		for(int i =0;i<a;i++) {
			int temp;
			temp=a1[i];
			a1[i]=b1[i];
			b1[i]=temp;
		}
		System.out.println("The first array after swapping is :");	
		for(int m:a1)
			System.out.println(m+" ");	
		System.out.println("The second array after swapping is :");	
		for(int m:b1)
			System.out.println(m+" ");	
			
		}
	}
}
