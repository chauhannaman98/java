import java.io.*;
import java.util.*;

public class TestClass {
	 public static void main(String[] args) { 
		Perimeter p = new Perimeter();
       	p.Area();
	}
}

class Perimeter	{
  	public void Area()	{
      	Scanner in = new Scanner(System.in);
      	int side = in.nextInt();
      	int Perimeter = 4*side;
      	System.out.print(Perimeter);
    }
}