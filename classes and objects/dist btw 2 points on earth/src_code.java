import java.io.*;
import java.math.*;	//for using acos, sin and cos functions
import java.util.*;

class Sample	{
  	double radius = 6371.01;
  	
  	public double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2)	{
      	double d;
      	double x1 = Math.toRadians(lat1);
      	double x2 = Math.toRadians(lat2);
      	double y1 = Math.toRadians(lon1);
      	double y2 = Math.toRadians(lon2);
      	d = radius*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
      	return d;
    }
} 	

public class TestClass {
	 public static void main(String[] args) { 
		Sample obj = new Sample();
       	Scanner in = new Scanner(System.in);
       	double lat1 = in.nextDouble();
       	double lon1 = in.nextDouble();
       	double lat2 = in.nextDouble();
       	double lon2 = in.nextDouble();
       	double dist=obj.distanceBetweenTwoPoints(lat1, lon1, lat2, lon2);
       	System.out.print(String.format("%.02f",dist));
	}
}