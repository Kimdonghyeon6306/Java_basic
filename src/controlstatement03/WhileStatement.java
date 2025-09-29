package controlstatement03;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
		//while문:반복문으로 반복횟수가 정해져 있지 않을때 주로 사용
		//형식:
		/*
			[초기식;]
			while(반복조건){
			
			  반복조건이 참일때 실행할 명령문들;
			   [증감식;]
			  
			  
			} 
					 
			 무한루프 처리]
			 while(true){
			 	실행할 명령문들;
			 }
		*/
		//while(int i=0) {}//[x]초기식은 for문에서만 사용가능
		//1부터 10까지 누적합:while문 사용
		int sum=0;//누적합을 저장할 변수 선언	
		int i=1;//[초기식]
		while(i <= 10) //[반복조건] 
		{
			sum+=i;//[명령문]
			i++;//[증감식]
		}
		System.out.println("1부터 10까지 누적합:"+sum);
		System.out.println("while문이 끝나 후 i:"+i);
		/*
		  문]1부터 1000까지 숫자중 3의 배수 이거나 5의 배수인
		     숫자의 합을 구해라
		     단,3과5의 공배수는 제외시켜라(while문 사용)		  
	   */
		sum=0;
		i=1;
		while(i <=1000) {
			if(i%3==0 ^ i % 5==0 ) sum+=i;
			i++;
		}
		System.out.println("1부터 1000까지 3의 배수이거나 5의 배수의 누적합(공배수 제외):"+sum);
		
		System.out.println("문자열을 입력세요?");
		//사용자가 몇 자를 입력할지 모름으로 while문 사용.(for문도 가능)
		
		char word;
		while((word=(char)System.in.read()) !=13) {
			System.out.print(word);
		}
		System.out.println();
		//for문으로 변경
		/*
		char word;
		for(;(word=(char)System.in.read()) !=13;) {
			System.out.print(word);
		}*/
		/*
		  0 0 0 1  (1,4) 
		  0 0 1 0  (2,3)
		  0 1 0 0  (3,2)
		  1 0 0 0  (4,1)처럼 출력해 보자		  
		*/
		int k=1;//바깥 while 초기식
		//방법1)int j=4;//안쪽 while 초기식
		while(k<=4) {
			//방법2)
			int j=4;
			while(j>=1) {
				if(k==j) System.out.printf("%-2d",1);
				else System.out.printf("%-2d",0);
				j--;
			}
			//방법1일때 추가 코드)j=4;
			System.out.println();//줄바꿈
			k++;
		}
		/*		
		  * 
		  * *
		  * * *
		  * * * *
		  * * * * *(while문으로)			 
		 */
		k=1;
		while(k<=5) {
			int j=1;
			while(k >=j) {
				System.out.printf("%-2c",'*');
				j++;
			}
			System.out.println();//줄바꿈
			k++;
		}
		/*
		  문]아래 형식대로 구구단을 출력
			2 * 1 = 2   3 * 1 = 3   4 * 1 = 4........9 * 1 = 9
			2 * 2 = 4   3 * 2 = 6   4 * 2 = 8........9 * 2 =18
			..
			..
			2 * 9 = 18  3 * 9 = 27  4 * 9 =36....... 9 * 9 = 1	
			
			while문으로...
	    */
		k=1;
		while(k<=9) {
			int j=2;
			while(j<=9) {
				System.out.printf("%d * %d =%-3d",j,k,j*k);
				j++;
			}
			System.out.println();//줄바꿈
			k++;
		}
		while(true) {
			System.out.println("무한루프");
			break;
		}
		System.out.println("프로그램 종료");//Unrechable code error
		
	}////main

}////class
