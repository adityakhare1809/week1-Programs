package Week1;
import java.io.*;
import java.util.*;
public class NegativeBeforePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		//int[] arr=new int[size];
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<size;i++) {
			arr.add(s.nextInt());
		}
		
		NegativeBeforePositive obj=new NegativeBeforePositive();
		obj.Print(obj.ArrangeNBP(arr));
		obj.Print(obj.ArrangePBN(arr));

	}
	
	ArrayList<Integer> ArrangeNBP(ArrayList<Integer>arr) {
		int NegativeIndex=0;
		if(arr.get(NegativeIndex)<0) {
			NegativeIndex++;
		}
		for(int i=1;i<arr.size();i++) {
			System.out.println("****"+arr.toString());
			if(arr.get(i)<0) {
				int temp1=arr.get(i);
				arr.add(NegativeIndex, temp1);
				arr.remove(i+1);
				NegativeIndex++;
			}
			else if(arr.get(i)==0) {
				int temp1=arr.get(i);
				arr.add(NegativeIndex, temp1);
				arr.remove(i+1);
			}
		}
		return arr;
	}
	
	ArrayList<Integer> ArrangePBN(ArrayList<Integer>arr) {
		int PositiveIndex=0;
		if(arr.get(PositiveIndex)>0) {
			PositiveIndex++;
		}
		for(int i=1;i<arr.size();i++) {
			System.out.println("****"+arr.toString());
			if(arr.get(i)>0) {
				int temp1=arr.get(i);
				arr.add(PositiveIndex, temp1);
				arr.remove(i+1);
				PositiveIndex++;
			}
			else if(arr.get(i)==0) {
				int temp1=arr.get(i);
				arr.add(PositiveIndex, temp1);
				arr.remove(i+1);
			}
		}
		return arr;
	}
	
	void Print(ArrayList<Integer>arr) {
		System.out.println("Arranged Array");
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}

}
