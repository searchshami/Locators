package com.java_logiassign;

public class Operators_LogicAssign {
/*public void logicOperator(int a = 12, int b = 15) {
boolean sum = a && b;
System .out.println(" " + sum);
}*/
	public void assignOperator() {
		int a = 3;
		a *= 6;
		System.out.println("Assigned value is " +a);
	}
public static void main(String[] args) {
	Operators_LogicAssign logasi = new Operators_LogicAssign(); 
	//logasi.logicOperator(12 , 15);
	logasi.assignOperator();
}
}
