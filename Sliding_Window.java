import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class SlidingWindow {

	public static int slidingWindow(int[]arr)
	{
		int len = arr.length;
		int sum = 0;
		java.util.List<Integer> test = new java.util.ArrayList<Integer>(); //Increasing the space complexity
		for(int i =0; i<len;i++)
		{
			while(i < i+3) //Contains an infinite loop; i will always be less than i+3
			{
				sum += arr[i];
			}
			i++;
			
			test.add(sum);
			sum = 0;
		}
		int max = Collections.max(test);		
		return max;
	}
	
	public static void main2(String[]args)
	{
		int[]arr = new int[]{1,2,3,4,5,6,7,8};
		System.out.print("Max sum = " +slidingWindow(arr));
	}
}
