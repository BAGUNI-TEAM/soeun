package star;

import java.util.Scanner;

public class Ten23 {

	public static void main(String[] args) {

		triangle2();


	}


	public static void triangle1() {
		// ���� �ﰢ��
		//���࿡ ���ؼ� ��ǥ�� ������ ���� -> n-i���� ��ǥ�� ����
		int num = 5;

		for(int i = 0 ; i < num ; i++ ) {
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void  triangle2() {
		// ���ﰢ�� �����
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		for(int i = 0 ; i < num ; i++ ) {

			if(i < num/2) {
				for(int j = 0 ; j < num ; j++ ) {
					if(j < num-i) {
						System.out.print(" ");	
					}else {
						System.out.print("*");
					}
				}
			}

			if(i > num/2) {
				for(int j = num ; j > num ; j-- ) {
					if(j < num-i) {
						System.out.print("*");	
					}else {
						System.out.print(" ");
					}
				}

			}

			System.out.println();
		}
	}












}
