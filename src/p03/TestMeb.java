package p03;

import java.util.Objects;

// java class : extends object 
class A {}
// = class A extends object {} extends object 생략가능
// equals() : 객체 비교 / 문자열 비교시 값을 비교 override
// 일반객체 equals() = "=="
// toString() : 객체명 출력
// hashCode() : heap 객체 위치
// getClass() : class 정보



class Meb {
	//fields
	private String	name;
	private String	num;
	
	//constructor
	public Meb() {
		System.out.println("meb class");
	}
	
	public Meb(String name, String num) {
		super();	// = object class 호출 super(); = object()
		// this();		// Meb 기본 생성자 호출
		this.name = name;
		this.num = num;
	}

	
	//getter setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNum() {
		return num;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	
	//method
	public	void	info() {
		
		System.out.println("name:" + name + ",num:" + num);
	}

	
	//override
	
	@Override
	public String toString() {
		return "Meb [name=" + name + ", num=" + num + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}
	
	
// m1.equals(m)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meb other = (Meb) obj;
		return Objects.equals(name, other.name) && Objects.equals(num, other.num);
	}
	
	
	
}



public class TestMeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meb m0	=	new Meb();
		m0.setName("aaa");
		m0.info();
		
		Meb	m1	=	new	Meb("a","aa");
		Meb m2	=	new Meb("b",null);
		Meb m3	=	new Meb("c",null);
		
		
		m1.info();
		m2.info();
		m3.info();
		
		
		Meb	m	=	new	Meb("a","aa");
		// if (m1 == m)
		// 객체 (instance) 비교 
			System.out.println(m1 == m); 			// false
		
		// 비교	
			System.out.println(m1.equals(m)); 		// true
			
		// A	a	=	new	A();
		// a.equals(a);
		// m.equals(a);
		System.out.println("==");
		System.out.println(m1);				// p03.Meb@c387f44
			// Meb [name=a, num=aa]
		System.out.println(m1.toString());	// p03.Meb@c387f44
			// Meb [name=a, num=aa]
		System.out.println(m1.hashCode());	// 205029188
		System.out.println(m1.getClass());	// class p03.Meb
		System.out.println(m);				// p03.Meb@4e0e2f2a

	}

}
