package algorithms;


import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		ArrayList <ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(); 
		
		arr.add(new ArrayList <Integer> (Arrays.asList(10, 14, 76)));

		arr.add(new ArrayList <Integer> (Arrays.asList(1, -4, -24)));
		arr.add(new ArrayList <Integer> (Arrays.asList(10, 9, -26)));
		
		
		System.out.println(arr.get(0).get(0));
		System.out.println(arr.size());

		int diagResult = 0;
		int oppDiag = 0;
		
		int m = 0;
		int n = arr.size() - 1; 
		
		for (int i = 0; i < arr.size(); i++) {
			
			for (int j=0; j < arr.size(); j++) {
				
				if (i == j)
					diagResult += arr.get(i).get(j).intValue();
				
				if (i== m && j == n) {
					oppDiag += arr.get(i).get(j).intValue();
					m++;
					n--;
				}
				
			}
			
		}
		
		System.out.println("Diag" + Math.abs(diagResult - oppDiag));
	}		
}
