
package p02;

class Memb{
	// fields
	private	String	name;
	private	String	num;
	
	
	// constructor
	// 기본 생성자 : @NoArgsConstructor
	public Memb() {
		
		
	}
	// 모든 생성자 : @AllArgsConstructor
	public Memb(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	
	// getter 
	public	String	getName() {
			return	this.name;
			
			
	}	

	public String getNum() {
		return num;
	}
	
	
	// setter
	// 쓰기 / 읽기만 가능
	// 쓰기전용

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setNum(String num) {
		this.num = num;
	}

	
	/*
	public	void setnum(String	num) {
		this.num	=	num;
		
		
	}
	*/
	
	//method
	public	void	info() {
		System.out.println("name:" + name + ",num:" + num);
		
	}




	
	
	
}

public class TestMemb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Memb	m1	=	new	Memb("a","b");
			//m1.name x error
			m1.info();
			Memb	m2	=	new	Memb("c","d");
			m2.info();		
			m2.setNum("");		// not visible
			
			String	m2Name	= m2.getName();
			System.out.println(m2.getName());
			// = System.out.println(m2Name);
			
			Memb	m3	=	new	Memb();
			m3.setName("f");
			m3.setNum("g");
			m3.info();		
	}

}
