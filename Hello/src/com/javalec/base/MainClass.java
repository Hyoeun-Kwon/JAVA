package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {

		/* ------------------------------
		 * �Ʒ��� ����� ȭ�鿡 ����ϴ� ����Դϴ�.
		 * ------------------------------- 
		 */
		
		// ȭ�鿡 ���ڿ� ��� ���
		System.out.println("-------------");
		System.out.println("Hello, World!");
		System.out.println("-------------");
		                                                                                                               
		
		System.out.print("-------------");
		System.out.print("Hello, World!");
		System.out.println("-------------");
		
					
		/*
		 * command + alt + ����Ű : ����Ű �������� �ٷ� ���� , alt + ����Ű : �������� �̵� ,command + d�� ����� (��) 
		 */
		
		// ȭ�鿡 ����(����) ��� ���
		System.out.println(10);
		System.out.println(10 + 20);  // ����
		System.out.println(10 - 20);  // ����
		System.out.println(10 * 20);  // ����
		System.out.println(10 / 20);  // ������ ���� 0.5 �̹Ƿ� �Ǽ��� �ȳ���
		System.out.println(10.0 / 20.0);  // ������( �Ǽ��θ���� �����ָ� �� ����)
		
		// ȭ�� ����� ���ڰ� �ϱ�
		System.out.println("a " + "b");
		System.out.println(10 + "+" + 20 + "=" + (10+20)); // ���ڿ��� ����(����) ���Ͽ� ����ϰ� �ϱ�
		System.out.println(10 + "-" + 20 + "=" + (10-20)); // ������� () ����� ���� ����, ���⵵ ����
		System.out.println(10 + "*" + 20 + "=" + (10*20));
		System.out.println(10 + "/" + 20 + "=" + (10/20));
		
		
		
	}

}
