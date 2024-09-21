package com.java_reloperator;

public class Operators_Relational {
public void greaterThan() {
	int a = 1;
	int b = 5;
	boolean sum = a > b;
	System.out.println(" Greater Value is : " +sum);
}
public void lesserThan() {
	int a = 1;
	int b = 5;
	boolean sum = a < b;
	System.out.println(" Lesser  Value is : " +sum);
}
public void notEqualto() {
	int a = 5;
	int b = 5;
	boolean sum = a != b;
	System.out.println(" Not Equal Value is : " +sum);
}
public void equalequalto() {
	int a = 5;
	int b = 5;
	boolean sum = a == b;
	System.out.println(" Equal to Value is : " +sum);
}
public void gThan_Equalto() {
	int a = 7;
	int b = 5;
	boolean sum = a >= b;
	System.out.println(" Greater than equal to  Value is : " +sum);
}
public static void main(String[] Args) {
	Operators_Relational rel = new Operators_Relational();
	rel.greaterThan();
	rel.lesserThan();
	rel.notEqualto();
	rel.equalequalto();
	rel.gThan_Equalto();
}
}
