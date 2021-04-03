package HomeWork.TEST;

class A {
	public char get () {
		return 'A';
	}
}

class B extends A {
	@Override
	public char get () {
		return 'B';
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.get());
	}
}