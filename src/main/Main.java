package main;

public class Main {

	public static void main(String[] args) {
		A a = new A("lime", "sugar");
		a.getTea();
		System.out.println(a.hashCode());		
		
		try {
			
			A t = (A)a.clone();
			t.getTea();
			System.out.println(t.hashCode());
			
			a.getB().setLime("Chery");
			a.getC().setSugar("Mint");
			a.setWater("Juice");
			a.getTea();
			System.out.println(a.hashCode());
			
			t.getTea();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
	}
}
