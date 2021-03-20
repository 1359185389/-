package com.crx.wpy;

public class ATM {
	//存钱
	public static String saveMoney(Customer customer,float money) {
		customer.amount+=money;
		System.out.println("用户"+customer.name+"存了"+money+"块钱。");
		return "存款成功！！";
	}
	//取钱
		public static String getMoney(Customer customer,float money) {
			customer.amount=customer.amount-money;
			System.out.println("用户"+customer.name+"取了"+money+"块钱。");
			return "取款成功！！";
		}
	//转账	
		public static String transferMoney(Customer customer1,Customer customer2,float money) {
			customer1.amount+=money;
			customer2.amount=customer2.amount-money;
			System.out.println("用户"+customer2.name+"向"+customer1.name+"转了"+money+"块钱。");
			return "转账成功！！";
		}
	//查看余额
		public static void showAmount(Customer customer) {
			System.out.println("用户"+customer.name+"的余额为："+customer.amount);
		}
}
