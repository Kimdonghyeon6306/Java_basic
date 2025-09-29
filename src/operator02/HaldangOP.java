package operator02;

public class HaldangOP {

	public static void main(String[] args) {
		/*
		  [할당(대입)연산자] 
		   = : 변수 = 값(변수) 
		      오른쪽에 있는 값을 왼쪽의 변수에 할당(대입)한다.
		  [축약표현]		 
		  +=,-=,*=,%=..등등
		  변수1 += 값(변수2) => 변수1 = 변수1+값 혹은    변수1 = 변수1+변수2 		  
		 */
		//1]할당(대입) 연산자	
		int num1;//변수 선언
		num1 = 100;//대입(할당) 연산자(=)로 초기화
		//※대입 연산자의 오른쪽 식이 항상 먼저 실행 된 후 그 결과값을 왼쪽의 변수에 대입
		int num2;
		num2 = num1;
		//왼쪽에는 항상 변수가 와야 한다.
		//10 = num1;//[x]
		
		//2]축약표현
		//※산술 연산자에만 적용
		num1+=100;//num1=num1+100;와 같다
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		
		num1 %=num2;//num1=num1%num2;
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		
		num2 *= 2+10;//num2=num2 * (2 + 10);와 같다
		System.out.printf("num1:%d,num2:%d%n",num1,num2);
		
		//num1 >=num2;//[x]
		//num1 &&=num2;//[x]
		
		/*
		증감연산자(단항 연산자):++(증가 연산자),--(감소연산자)
					++는 자기 자신을 1 증가 시킨다
					--는 자기 자신을 1 감소 시킨다.
					단독으로 쓰일때는 항이 증감연산자 
					앞에 붙거나 뒤에 붙거나 
					결과는 같다.
					하지만 다른 연산자와 결합할때는 
					++(--)변수:먼저 자신을 증감 시킨다
					변수++(--):다른 연산을 수행한후 자신을 
					증감시킨다.					
					
	    */
		//단독으로 사용시]
		int num3=10;
		//변수명++(후위 연산자)
		//num3++;//num3=num3+1;와 같다
		//System.out.println("num3:"+num3);//11
		//++변수명(전위 연산자)
		//++num3;//num3=num3+1;와 같다
		System.out.println("num3:"+num3);//11
		
		//다른 연산과 함께 사용시]
		int num4 =10;
		//후위 연산: 다른 연산을 먼저 수행한 후 
		//마지막에 자기자신을 1 증가(++)시키거나 감소(--)시킨다.
		/*
		 int result = num3 + num4;
		 num4=num4+1;
		 */
		//int result = num3 + num4++;
		//num3:12,num4:11,result:22
		//System.out.printf("num3:%d,num4:%d,result:%d%n",num3,num4,result);
		
		
		//전위 연산: 자기 자신을 먼저 1 증가(++)시키거나 감소(--)시킨후
		//다른 연산을 수행한다
		/*
			num4=num4+1;
			int result = num3 + num4;
		 */
		int result = num3 + ++num4;
		//num3:12,num4:11,result:23
		System.out.printf("num3:%d,num4:%d,result:%d%n",num3,num4,result);
		
		
		
	}///main

}///class
