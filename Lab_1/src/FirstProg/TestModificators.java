package FirstProg;

class A {
	private int n;
	int k;
	A() {
		k = 2;
		n = 11;
	}
	int summa() {
		return k+n;
	}
	public int getN() {
		return n;
	}
	public void setN(int nn) {
		n = nn;
	}
}

public class TestModificators {
	public static void main(String args[]) {
		A obj = new A();
		int kk = obj.k;
		System.out.println("k = " + kk);
		int nn = obj.getN();
		System.out.println("n = " + nn);
		obj.k = 10;
		obj.setN(15);
		int s = obj.summa();
		System.out.println("summa = " + s);
	}
}
