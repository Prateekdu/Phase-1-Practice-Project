package com;
class arrayRotation{
	public void rotation(int[] b,int c) 
	{
		if(c>b.length)
		{
			c=c%b.length;
		}
		int[] r=new int[ b.length];
		for(int i=0;i<c;i++)
		{
			r[i]=b[b.length-c+i];
		}
		int j=0;
		for(int i=c;i<b.length;i++)
		{
			r[i]=b[j];
			j++;
		}
		System.arraycopy(r,0,b,0,b.length);
	}
}
public class rotationArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		System.out.println("Array before rotation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		arrayRotation ar=new arrayRotation();
		ar.rotation(a,6);
	
		System.out.println();
		System.out.println("Array after rotation");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
