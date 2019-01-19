import java.util.*;
import java.io.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       	Factorial f = new Factorial();
       	f.n = in.nextInt();
       	f.fact();
       	System.out.print(f.fac);
	}
}

class Factorial	{
  		int fac=1;
  		int n;
  	public void fact()	{
      	for(int i=n; i>0; i--)	{
          	fac*=i;
        }
    }
}