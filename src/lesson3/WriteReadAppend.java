package lesson3;
import java.io.*;
import java.util.*;
public class WriteReadAppend {
	public static void writeFile() throws IOException
	{
		File file= new File("CC:\\Users\\Prateek\\eclipse-workspace\\Phase-1 Practice Project\\src\\lesson3\\data.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		
		System.out.println("write the text");
		Scanner sc2=new Scanner(System.in).useDelimiter("\n");
		String s=sc2.next();
		
		writer.write(s);
		writer.close();
		
		
	}
	public static void readFile() throws IOException
	{ 
		FileReader reader= new FileReader("C:\\Users\\Prateek\\eclipse-workspace\\Phase-1 Practice Project\\src\\lesson3\\data.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}
	public static void appendFile(String fileName,String str) 
	{
		
		 try {
			   BufferedWriter out = new BufferedWriter(
	           new FileWriter(fileName, true));
	 
	            out.write(str);
	            out.close();
	        }
	    catch (IOException e)
		 { 
	                System.out.println("exception occurred" + e);
	     }
		
		
	}
	public static void main(String[] args) {
		System.out.println("enter your option:"+'\n'+"1->Enter 1 for read the file"+'\n'+"2->Enter 2 for write in the file"+'\n'+"3->Enter 3 for append text");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			try {
			 readFile();
			 
			} catch (IOException e) {
			
			System.out.println("File not available");
			}
		
		}
		
		if(n==2)
		{
		
			try {
			writeFile();
			} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("File not available");
			}
		}
		if(n==3)
		{
			Scanner sc1=new Scanner(System.in).useDelimiter("\n");
			String str=("C:\\Users\\Prateek\\eclipse-workspace\\Phase-1 Practice Project\\src\\lesson3\\data.txt");
			System.out.println("Enter the text");
			
			String apptext=sc1.next();;
			
			appendFile(str,apptext);
			System.out.println("After append the file :");
		
			try {
			readFile();
			} catch (IOException e) {
			
			System.out.println("File not available");
			}
		}
		
	}

}
