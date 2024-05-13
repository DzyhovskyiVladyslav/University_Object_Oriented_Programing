package FirstProg;

class MyType {
	public int myData = 5;
	public boolean myBool = false; 
	MyType(){
		System.out.println("Constructor without parameters");
	}
	MyType(int v){
		System.out.println("Constructor with one parametr");
		System.out.println("Setting myData = "+v);
		myData = v;
	}
	MyType(boolean B, int v){
		myBool = B;
		myData = v;
	}
	public void myMethod() {
		System.out.print("myMethod!");
		System.out.println("myData = "+myData);
	}
}

public class NewClass {

	public static void main(String[] args) {
		MyType obj1 = new MyType();
		obj1.myMethod();
		System.out.println("--obj1.myData = " +obj1.myData);
		MyType obj2 = new MyType(100);
		System.out.println("--obj2.myData = " +obj2.myData);
		MyType obj3 = new MyType(true, 10);
		System.out.println("--obj3.myBool = " +obj3.myBool);
		System.out.println("--obj3.myData = " +obj2.myData);
		
	}
}
