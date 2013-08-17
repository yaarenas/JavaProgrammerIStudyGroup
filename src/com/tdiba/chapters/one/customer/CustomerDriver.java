package com.tdiba.chapters.one.customer;

public class CustomerDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer c = new Customer();
		String pablo = null;
		try {
			c.setName(pablo);
		} catch (Exception e) {
			System.out.println("error");
		}
		c.setBalance(12345f);
		c.setAccountNumber(81123332);
		System.out.println(c);
	}
}
