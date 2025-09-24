package datatype;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		1]자동 형변환:
		  작은 그릇의 데이타를->큰 그릇에 넣을때
		  형변환이 자동으로 일어남
		  즉 형변환 불필요 
		*/
		byte b1=97;
		short s1;
		s1 = b1;//[o]자동 형변환
		System.out.println("b1는 "+b1+",s1은 "+s1);
		//아래는 자동 형변환이 아님.
		int num1 = b1+s1;//b1+s1의 연산 결과가 int형임으로 int형을 int형에 대입하니까
		
		char ch1=65;//[o] 65는 문자의 코드값(십진수) 즉 ch1='A'와 같다
		//char ch2=b1;//[x]예외(작은 그룻->큰 그룻).형변환을 해야한다.b1은 변수임으로 음수가 저장될 수도 있다. 
					  //코드값(char형)은 음수가 없다
		              //즉 char는 부호가 없고 byte형 부호가 있는 자료형이다 
		
		char ch2=(char)b1;
		System.out.println("ch2="+ch2);
		/*
		2]강제적 형변환:
		큰 그릇의 데이타->작은 그릇의 담을때
		캐스팅 연산자를 사용:(자료형)
		-데이타 손실이 일어 날 수도 있다
		*/
		short s2=100;
		//byte b2 = s2;//[x]
		byte b2 = (byte)s2;
		System.out.println("[데이타 미 손실] b2는 "+b2);
		//데이타 손실이 일어나는 경우]
		int num3=300;
		//b2 = num3;//[x]
		b2 = (byte)num3;
		System.out.println("[데이타  손실] b2는 "+b2);
		
		double d1=3.14;
		//int num4=d1+num3;//[x]num3+d1의 연산 결과는 double
		//방법1]double형에 담는다(형변환 하지 않고)
		double d2 = d1+num3;//[o]
		//방법2]연산결과 전체를 int형으로 형변환
		int num4=(int)(d1+num3);//[o]
		//방법3]double형만 int형으로 형변환(위험)
		num4=(int)d1+num3;
		
	}///main
}///class
