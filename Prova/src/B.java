
public abstract class B implements A {
	
	@Override
	public void f1() {
		System.out.println("f1 di B");
	}
	
	private void g() {
		System.out.println("f2 di B");
	}

}
