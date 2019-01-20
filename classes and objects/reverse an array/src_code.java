import java.io.*;
import java.util.*;

class Reverse	{
  	int[] arr = new int[100];
  	int n;
  	public void getInput()	{
      	Scanner in = new Scanner(System.in);
      	n = in.nextInt();
      	
      	for(int i=0; i<n; i++)	{
        	arr[i] = in.nextInt();
      	}
    }
  	
  	public void arrayReverse()	{
      	for(int i=n-1; i>=0; i--)	{
          	System.out.print(arr[i]+" ");
        }
    }
}
      
public class TestClass {
	 public static void main(String[] args) { 
		Reverse obj = new Reverse();
       	obj.getInput();
       	obj.arrayReverse();
	}
}