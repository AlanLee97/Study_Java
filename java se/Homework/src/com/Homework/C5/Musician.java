//Musician¿‡
package com.Homework.C5;

public class Musician {
	public static void paly(Instrument i) {
		i.makeSound();
	}
	public static void main(String[] args) {
//		Erhu e = new Erhu();
//		Piano p = new Piano();
//		Violin v = new Violin();
		
		Instrument e = new Erhu();
		Instrument p = new Piano();
		Instrument v = new Violin();
		
		paly(e);
		paly(p);
		paly(v);
	}

}
