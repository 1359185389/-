package com.crx.wpy;

import java.util.Scanner;

public class test {

	public static void main(String[] args)  {
		String id;
		String name;
		float money;
		Customer customer1 = new Customer("180522217","王鹏宇",10000,"123456") ;
		Customer customer2 = new Customer("180522216","吴双",10000,"123456") ;
		ATM.getMoney(customer1, 1000);
		ATM.saveMoney(customer1, 2000);
		ATM.transferMoney(customer1, customer2, 5000);

}
}
