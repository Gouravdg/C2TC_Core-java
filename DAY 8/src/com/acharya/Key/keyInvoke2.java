package com.acharya.Key;


class Demo{
	   Demo()
	   {
		 System.out.println("hello a");
	   }
	   Demo(int x)
	   {
		   this();
		   System.out.println(x);
	   }
}
public class keyInvoke2 {

	public static void main(String[] args) {
          Demo a=new Demo(10);
          

	}

}