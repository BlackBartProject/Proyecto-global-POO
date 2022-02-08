package clases_internas;

public class Main {

	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();

		System.out.println(outer.outer);
		System.out.println(inner.inner);

		System.out.println(outer.outerMessage());
		System.out.println(inner.innerMessage());

	}

}
