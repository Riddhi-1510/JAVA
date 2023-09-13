
import java.util.Scanner;

interface Sample1{
	int x=3;
	public void mul();
}

abstract class SampleAbs{
	int x,y,z;
	final float PI=3.14f;
	void add(){
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		z = x+y;
		System.out.println("Z is : " + z);
	}
	abstract public void sub();
}

public class SampleInterfaceAbs extends SampleAbs implements Sample1 {
	public void sub(){
		System.out.println("This is sub method....");
	}
	public void mul(){
		System.out.println("This is Mul method....");
	}
	public static void main(String args[]){
		SampleInterfaceAbs obj = new SampleInterfaceAbs();
		obj.sub();
		obj.mul();
		obj.add();
	}
}
