package com.fibonacci.Test;

public class Test {
	
	
	//1��1��2��3��5��8��13��21,34,55,89���Դ����ƣ���һ��Ϊǰ����ĺ�
	public static int fibonacci(int n) {  
	    if (n <= 0) {  
	        return -1;  
	    } else if (n == 1 || n == 2) {  
	        return 1;  
	    } else {  
	        int start = 3;  
	        int f = 1;//��1λ  
	        int b = 1;//��2λ  
	        while (start++ <= n) {  
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
		int number = fibonacci02(11);
		System.out.println("number:" + number);
	}

}