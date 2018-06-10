public class ArrayData4105056004 extends ArrayData 
{
	int len,i;
	public ArrayData4105056004(int[] input)
	{
		this.A = input;
		this.len = A.length;
	}
	public int max() 
	{
		for(i = 1; i < len; ++i)
			if(A[i] > A[0])
				A[0] = A[i];
		return A[0];
	}
	public int dot(int[] B) 
	{
		A[0] = A[0]*B[0];
		System.out.println(A[0]);
		for(i = 1; i < len; ++i)
			A[0] += A[i]*B[i];
		return A[0];
	}
	public static void main(String[] args) 
	{
		int[] A = {1,5,1};
		int[] B = {1,2,1};
		ArrayData4105056004 test = new ArrayData4105056004(A);
		
		System.out.println(test.max());
		System.out.println(test.dot(B));
	}
}
