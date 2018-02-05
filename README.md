# fibonacciDemo
斐波那契数列算法，面试常考，最基本的算法必然要掌握

# 核心代码

//0,1,1,2,3,5,8,13,21,34,55,89，以此类推，后一项为前两项的和 F(0)=0，F(1)=1,F(2)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）

		public static int F(int n){
			if (n < 0) {
				return -1;
			}else if (n == 0) {
				return 0;
			}else if (n == 1 || n == 2) {
				return 1;
			}else {
				return F(n-1)+F(n-2);
			}
		}
