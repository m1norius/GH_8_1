package main;

public class A implements Cloneable{
	
	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	private B b;
	private C c;
	private String water = "water";
	
	

	

	public A(String name1, String name2){
		b = new B(name1);
		c = new C(name2);
	}
	
	public void getTea(){
		System.out.println(b.getLime() +" + "+c.getSugar()+" + " + this.water);
	}
	
	public String getWater() {
		return water;
	}

	public void setWater(String water) {
		this.water = water;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		A clone = new A(b.getLime(), c.getSugar());
		return clone;
	}
}
