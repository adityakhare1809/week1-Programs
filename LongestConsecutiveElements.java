package Week1;
import java.io.*;
import java.util.*;
public class LongestConsecutiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		LongestConsecutiveElements obj=new LongestConsecutiveElements();
		System.out.println("LongestConsecutive Length is "+obj.LongestLength(arr));
	}
	
	public int LongestLength(int[] arr) {
		Arrays.sort(arr);//Insertion sort or Marge Sort with O(n)log(n)
		int currentLength=1;
		int longestL=1;
		for(int i=1;i<arr.length;i++) {
			if (Math.abs(arr[i-1]-arr[i])==1) {
				currentLength++;
			}
			else {
				currentLength=1;
			}
			if(longestL<currentLength) {
				longestL=currentLength;
			}
		}
		return longestL;
	}

}
