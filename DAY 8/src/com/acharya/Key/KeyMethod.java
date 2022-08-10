package com.acharya.Key;
class S2

{
	void v(S2 a) {
		System.out.println("method is invoked");
	}
	void p() {
		v(this);
	}
}

public class KeyMethod {

	public static void main(String[] args) {
		        S2 s=new  S2();
		        s.p();


	}

}