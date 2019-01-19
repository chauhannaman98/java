import java.io.*;
import java.util.*;

public class TestClass {
  		int x;
  		public void read()	{
          	Scanner in = new Scanner(System.in);
          	x = in.nextInt();
        }
  
  		public void disp()	{
          	if(x%2==0)	{
              	System.out.print(x+" is Even");
            }
          	else	{
				System.out.print(x+" is Odd");
            }
        }
  
	 	public static void main(String[] args) { 
			TestClass tc = new TestClass();
          	tc.read();
          	tc.disp();
		}
}