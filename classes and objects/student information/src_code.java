import java.io.*;
import java.util.*;

public class TestClass {
	 public static void main(String[] args) { 
       int ID, age;
       String name;
       Scanner in = new Scanner(System.in);
       
       name = in.nextLine();
       ID = in.nextInt();
       age = in.nextInt();
       
       StudentData myobj = new StudentData();
       System.out.println("Student Name is:"+myobj.getStuName());
       System.out.println("Student Age is:"+myobj.getStuAge());
       System.out.println("Student ID is:"+myobj.getStuID());
       
       StudentData myobj2 = new StudentData(ID, name, age);
       System.out.println("Student Name is:"+myobj2.getStuName());
       System.out.println("Student Age is:"+myobj2.getStuAge());
       System.out.println("Student ID is:"+myobj2.getStuID()); 
       
	}
}

class StudentData	{
  
  	int stuID;
  	String stuName;
  	private int stuAge;
  
  	StudentData()	{
      	stuID = 100;
      	stuName = "New Student";
      	stuAge = 18;
    }
  
  	StudentData(int num1, String str, int num2){
       	stuID = num1;
       	stuName = str;
       	stuAge = num2;
   		}
   
   public int getStuID() {
      	return stuID;
   		}
  
   public void setStuID(int stuID) {
       	this.stuID = stuID;
   		}
  
   public String getStuName() {
       	return stuName;
   		}
  
   public void setStuName(String stuName) {
       	this.stuName = stuName;
   		}
  
   public int getStuAge() {
       	return stuAge;
   		}
  
   public void setStuAge(int stuAge) {
       	this.stuAge = stuAge;
   		}
}     	