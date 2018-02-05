package com.fibonacci.Test;

import java.util.Iterator;

public class Test {
	
	
	//0,1,1,2,3,5,8,13,21,34,55,89���Դ����ƣ���һ��Ϊǰ����ĺ� F(0)=0��F(1)=1,F(2)=1, F(n)=F(n-1)+F(n-2)��n>=2��n��N*��
	public static int fibonacci(int n) {  
	    if (n < 0) {  
	        return -1;  
	    } else if (n == 0) {
			return 0;
		}else if (n == 1 || n == 2) {  
	        return 1;  
	    } else {  
	        int flag = 3;//�ӵ���λ��ʼ  
	        int f = 1;//��1λ  
	        int b = 1;//��2λ  
	        while (flag++ <= n) {  
	            //ÿ��ѭ������b��f����һλ������b��������Ҫ��ֵ  
	            //��n=3ʱ��ֻ��Ҫִ��1��  
	            //��n=4ʱ���ƶ�1���Ժ�Ҫ���ƶ�1��  
	            //��n=5ʱ��������Ļ��������ƶ�1��  
	            b = b + f;//b ������ұ���һλ  
	            f = b - f;//f ���b֮ǰ��ֵ  
	        }  
	        return b;  
	    }  
	  
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			int number = fibonacci(i);
			System.out.println("�� " + i + "��: " + number);
		}
	}

}
