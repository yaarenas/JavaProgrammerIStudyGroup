package com.tdiba.chapters.two;

public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		/*
		 * Recomiendo poner un breakpoint en la linea despues de este comentario
		 * y observar paso a paso las variables que se van creando
		 * */
		String a = "un string";
		String b = "otro string";
		String c = a;
		String d = b;
		a = a + " con algo";
		b = b.concat(" con algo");
		System.out.println(c);
		System.out.println(d);
	}

}
