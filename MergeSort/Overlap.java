package mergesort;
import mergesort.MergeSort;
public class Overlap 
{
	public int overlap(int[][] a)
	{
		MergeSort xm = new MergeSort();
		MergeSort ym = new MergeSort();
		int[] x = new int[a.length];
		int[] y = new int[a.length];
		int i = 0;
		while (i!=a.length)
		{
			x[i] = a[i][0];
			y[i] = a[i][1];
			i++; 
		}
		x = xm.mergeSort(x);
		y = ym.mergeSort(y);
		i = 0;
		int count = 0;
		int max = 0;
		for(int v = 0; v < y[y.length-1]; v++)
		{
			while(i < a.length)
			{
				if(v == a[i][0])
				{
					count++;
					i++;
					if(max < count)
					{
						max = count;
					}
				}
				else if(v == a[i][1])
				{
					count--;
					i++;
				}
				else
				{
					i++;
				}
			}
			i = 0;
		}
		return max;
	}
}
