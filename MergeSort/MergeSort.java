package MergeSort;

public class MergeSort 
{
	
	public int[] mergeSort(int[] A)
	{
		if (A.length <= 1)
		{
			return A;	
		}
		int mid;
		int[] a;
		int[] b;
		if(A.length%2 == 0)
		{
			mid = A.length/2;
			a = new int[mid];
			b = new int [mid];
		}
		else
		{
			mid = (A.length + 1)/2;
			a = new int[mid];
			b = new int[mid - 1];
		}
		for(int i = 0; i < a.length; i ++)
		{
			a[i] = A[i];
		}
		int x = 0;
		for(int j = a.length; j < A.length; j++)
		{
			if(x < b.length)
			{
				b[x] = A[j];
				x++;
			}
		}
		a = mergeSort(a);
		b = mergeSort(b);
		return merge(a,b);		
	}

	public int[] merge(int[] a, int[] b)
	{
		int[] c = new int[a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k < c.length)
		{
			if(i < a.length && j < b.length)
			{
				if (a[i] <= b[j])
				{
					c[k] = a[i];
					i++;
				}
				else
				{
					c[k] = b[j];
					j++;
				}
				k++;
			}
			else if(i >= a.length && j < b.length)
			{
				if(j+1 < b.length)
				{
					if(b[j] <= b[j+1])
					{
						c[k] = b[j];
					}
					else
					{
						c[k] = b[j+1];
					}
					k++;
					j++;
				}
				else
				{
					c[k] = b[j];
					k++;
				}
			}
			else if(i < a.length && j >= b.length)
			{
				if(i+1 < a.length)
				{
					if(a[i] <= a[i+1])
					{
						c[k] = a[i];
					}
					else
					{
						c[k] = a[i+1];
					}
					k++;
					i++;
				}
				else
				{
					c[k] = a[i];
					k++;
				}
			}
		}
		return c;
	}			
}
