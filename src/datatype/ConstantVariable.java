package datatype;


/*
 * 상수:저장된 값이 절대 변하지 않은 메모리의 한 종류
 * 선언방법: final 자료형 변수명=초기값;           
 * 상수 선언후 중간에 값을 변경하면 에러
 * 상수명은 보통 대문자로 선언한다
 * 상수는 프로그램의 가독성을 높이고 유지 보수시에도 유리하다
 * 혹은 고정된 데이타를 상수로 선언한다
 */
//※클래스 안이 아닌 특정 블락(지역)에서 선언된 변수 나 상수를 지역변수 혹은 지역상수라 한다.
public class ConstantVariable {
	//클래스 안]
	//클래스 안에서 상수를 선언할때는 반드시 선언과 동시에 초기화하거나
	//초기화하지 않을시는 생성자에서 초기화 해야한다
	//final double PI;//[x]초기화 안해서
	static final double PI=3.14;//[O]초기화,PI는 double형 상수
	//System.out.println(PI);//명령문 불가.선언문만 가능
	
	
	//프로그램의 가독성을 높이기 위한 상수 선언
	static final int SCISSORS=1;
	static final int ROCK=2;
	static final int PAPER=3;
	
	public static void main(String[] args) {
		System.out.println(PI);
		//PI=3.141592653589793;//[X]
		/*메소드(즉 지역)안에서 상수를 선언할때는 초기화를
		  사용 전에만 해주면 된다.
		  보통 메소드(지역)안에서는 상수 선언을 잘 안함
		  주로 클래스 안에서 상수 선언 함.*/
		final String NICKNAME;//[O]
		//System.out.println(NICKNAME);//[x]초기화 안해서
		NICKNAME="자바";//상수 초기화
		System.out.println(NICKNAME);//[O]
		//NICKNAME="ICT";//[x]값 변경 불가
		
		int computer=1,user=2;
		System.out.println("컴퓨터 LOSE : 가독성이 낮다");
		
		computer=SCISSORS;
		user=ROCK;
		System.out.println("컴퓨터 LOSE : 가독성이 높다");
	}///main
	

}////class
