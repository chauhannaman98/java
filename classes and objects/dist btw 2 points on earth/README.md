## Write a Java program to compute the distance between two points on the surface of earth.

x1 = Math.toRadians(lat1)
y1 = Math.toRadians(lon1)
x2 = Math.toRadians(lat2)
x3 = Math.toRadians(lon2)

Distance between the two points [ (x1,y1) & (x2,y2)]

d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers

Mandatory terms:

1. Create a new class "Sample" and a method named "distanceBetweenTwoPoints()" of type double

2. The method should take four arguments with double data type
public double distanceBetweenTwoPoints(double lat1, double lon1, double lat2, double lon2)

Methodname = distanceBetweenTwoPoints
Argument = Four Arguments - double lat1, double lon1, double lat2, double lon2 of type double with variable names mentioned in the argument
Access Specifier = public
Return Type = double


3. Access the method "public double distanceBetweenTwoPoints(double lat1,double lon1,double lat2,double lon2)" inside the main method under main class (TestClass)

4. Use return to pass the final value computed in distanceBetweenTwoPoints to the main method 

5. The final answer should be rounded using String.format("%.02f", variablename)