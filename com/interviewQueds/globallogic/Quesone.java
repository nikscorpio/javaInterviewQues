package com.globallogic;

public class Quesone {

	static int cnt = 0;
	
	static void mrf(int n) {
		if(n==0)
			return ;
		cnt++;
		mrf(n/10);
		
	}
	static int main() {
		mrf(123456789);
		System.out.printf("%d",cnt);
		return 0;
		
	}
	
	public static void main(String[] args) {
		main();
	//Ques1
		/*int[] [] data = {{123},{4,5,6}};
		int[] [] copy = data.clone();
		
		copy[0][0] = 100;
		System.out.println(data[0][0]);
		System.out.println(copy[0][0]);
		copy[1]=new int[] {300,400,500};
		
		System.out.println(data[1][1]);
		System.out.println(copy[1][1]);*/
		
	//Ques2
		/*for(int i=0;i<101;i++) {
			
			if(i%2==0) {
				System.err.println(i+" ");
			}else
				System.out.println(i + " ");
			
		}*/
		
		//dostuff(1);
		//dostuff(1,2);
		
		
		
		
		
		
		
	}
	
	static void dostuff(int... doArgs) {}
	//static void dostuff(int x, int... doargs) {}
	
	
}
