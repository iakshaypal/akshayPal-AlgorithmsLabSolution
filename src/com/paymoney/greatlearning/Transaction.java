package com.paymoney.greatlearning;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author user
 *
 */
public class Transaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Please Enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("\n Please enter the value of array: ");
		int i;
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("\n Please Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();
		while (targetNo-- != 0) {
			int flag = 0;
			int target;
			System.out.println("\n Enter the value of target");
			target = sc.nextInt();
			int sum = 0;
			for (i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("\n Target achieved after : " + (i + 1) + " Transaction");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("\n Given target is not achieved");
			}
		}
	}

}
