package com.tdiba.chapters.one;

public class HelloWorldWithArgs {

	/**
	 * Hello World que recibe parametros en linea de texto
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Hola Mundo!");
		} else if (args.length == 1) {
			System.out.println("Hola " + args[0] + "!");
		} else {
			System.out.println("Este programa recibe un solo argumento");
		}

	}

}
