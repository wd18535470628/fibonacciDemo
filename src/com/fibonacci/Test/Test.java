package com.fibonacci.Test;

import java.util.Iterator;

public class Test {
	
	
	//0,1,1,2,3,5,8,13,21,34,55,89，以此类推，后一项为前两项的和 F(0)=0，F(1)=1,F(2)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
	public static int fibonacci(int n) {  
	    if (n < 0) {  
	        return -1;  
	    } else if (n == 0) {
			return 0;
		}else if (n == 1 || n == 2) {  
	        return 1;  
	    } else {  
	        int flag = 3;//从第三位开始  
	        int f = 1;//第1位  
	        int b = 1;//第2位  
	        while (flag++ <= n) {  
	            //每次循环都把b和f右移一位，最终b就是我们要的值  
	            //当n=3时，只需要执行1次  
	            //当n=4时，移动1次以后要再移动1次  
	            //当n=5时，在上面的基础上再移动1次  
	            b = b + f;//b 变成它右边那一位  
	            f = b - f;//f 变成b之前的值  
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
			System.out.println("第 " + i + "项: " + number);
		}
	}

}
