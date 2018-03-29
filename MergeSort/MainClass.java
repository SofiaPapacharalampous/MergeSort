package MergeSort;

import MergeSort.Overlap;

public class MainClass 
{
	public static void main(String args[])
	{
		Overlap overlap = new Overlap();
		int[][] array = {{4,6}, {3,7}, {5,40}};
		int x = 0;
		x = overlap.overlap(array);
		System.out.println("maximum overlap: " + x);
	}	
}
