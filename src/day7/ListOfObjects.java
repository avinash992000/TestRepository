package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import day5.Account;

public class ListOfObjects {

	public static void main(String[] args) {
		//List<Account> list = new ArrayList<>();
		Set<Account> list = new HashSet();
		Account list1= new Account();
		list1.setAccNum(12432);
		list1.setBalance(543254);
		list.add(list1);
		list1= new Account();
		list1.setAccNum(12432);
		list1.setBalance(543254);
		list.add(list1);
		list1= new Account();
		list1.setAccNum(5678);
		list1.setBalance(987);
		list.add(list1);
		for(Account i:list) {
			System.out.println(i.getAccNum()+" "+i.getBalance());
		}
		

	}

}
