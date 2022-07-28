package lesson4;

public class LongestIncreasingSubsequence {
	static int l; 
    static int _lis(int arr[], int n)
    {
        if (n == 1)
        {
        	return 1;
        }
        int r, max_end = 1;
        for (int i = 1; i < n; i++) 
        {
            r = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && r + 1 > max_end)
            {
            	max_end = r + 1;
            }
                
        }
        if (l < max_end)
        {
        	l = max_end;
        }
        return max_end;
    }
    static int lis(int arr[], int n)
    {
       
        l = 1;
        _lis(arr, n);

        return l;
    }
 
    public static void main(String args[])
    {
        int arr[] = {10,20,40,50,60,70,80,90,100};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n)
                           + "\n");
    }
}
