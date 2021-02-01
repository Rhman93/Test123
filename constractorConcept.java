package Java;

public class constractorConcept {
	
	static int a;
	static int b;
	constractorConcept(){
		System.out.println("hello every one");
		System.out.println(My first pull from github )
	}
	
	constractorConcept(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	static void test() {
		System.out.println(a+b);
	}
	static void test1() {
		System.out.println(a-b);
		
	}
	
	public static void main(String[] args) {
		
		constractorConcept cc=new constractorConcept();
		constractorConcept cc1=new constractorConcept(200,100);
		test();
		test1();

	}

}
Change by Md Moshahidur Rahman-------------------------------------------------
