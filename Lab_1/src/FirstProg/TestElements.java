package FirstProg;

class StaticAndDynamic {
	int i = 0;
	static int j = 0;
	char DynamicChar = 0;
	static char StaticChar = 0;
	static void setJ(int k) {
		System.out.println("Static Method");
		j = k;
	}
	static int getJ() {
		System.out.println("Static Method");
		return j;
	}
	static void setSC(char s) {
		System.out.println("Static Method");
		StaticChar = s;
	}
	static char getSC() {
		System.out.println("Static Method");
		return StaticChar;
	}
	void setI(int k) {
		System.out.println("Dynamic Method");
		i = k;
	}
	int getI() {
		System.out.println("Dynamic Method");
		return i;
	}
	void setDC(char s) {
		System.out.println("Dynamic Method");
		DynamicChar = s;
	}
	char getDC() {
		System.out.println("Dynamic Method");
		return DynamicChar;
	}
	int summa() {
		System.out.println("Dynamic Method");
		return i+j;
	}
}

public class TestElements {
	public static void main(String args[]) {
		int ii, jj;
		StaticAndDynamic.j = 6;
		jj = StaticAndDynamic.j;
		System.out.println("Main, jj = " + jj);
		StaticAndDynamic.setJ(4);
		jj = StaticAndDynamic.getJ();
		System.out.println("Main, jj = " + jj);
		StaticAndDynamic obj = new StaticAndDynamic();
		obj.i = 3;
		ii = obj.i;
		System.out.println("Main, ii = " + ii);
		obj.setI(8);
		ii = obj.getI();
		System.out.println("Main, ii = " + ii);
		ii = obj.summa();
		System.out.println("Main, summa = " + ii);
		StaticAndDynamic.setSC('B');
		System.out.println("Main, Symb = " + StaticAndDynamic.getSC());
		StaticAndDynamic obj2 = new StaticAndDynamic();
		StaticAndDynamic.j = 10;
		System.out.println("Main, Symb = " + obj2.getDC());
	}
}
