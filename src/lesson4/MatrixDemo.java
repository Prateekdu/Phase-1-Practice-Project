package lesson4;

public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{1,3}};
		int b[][]= {{1,2},{1,3}};
		//create another matrix
		int c[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<2;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			    System.out.print(c[i][j]+" ");  //printing matrix element  
			}
			System.out.println();
		}
	}

}
