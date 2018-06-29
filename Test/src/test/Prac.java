package test;
import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(reverseWord(s));
		scan.close();
	}
	
	public static String reverseWord(String s){

	    char[] arr = s.toCharArray();

	    for(int i=0,j=arr.length-1;i<=j;i++,j--){
	        char tmp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = tmp;
	    }
	    return String.valueOf(arr);
	}
} 
