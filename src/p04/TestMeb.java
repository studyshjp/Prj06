package p04;

// import java.util.Iterator;
// import java.util.Objects;

class	Meb{
	//fields

	private		String	name;
	private		String	num;
	private		int		bYear;
	
	//constructor
	
	public Meb() {}
	
	public Meb(String name, String num, int bYear) {
	super();
	this.name = name;
	this.num = num;
	this.bYear = bYear;
	
}

	// getter

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public int getbYear() {
		return bYear;
	}

	@Override
	public String toString() {
		return "Meb [name=" + name + ", num=" + num + ", bYear=" + bYear + "]";
	}
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(bYear), name, num);
	}
	*/
	
	// mArr[0] (this) == m (other)
	// mArr[0].equals(m)
	
	@Override
	public boolean equals(Object obj) {		
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		*/
		
		Meb other = (Meb) obj;
		/*
		return this.bYear == other.bYear 
				&& Objects.equals(name, other.name) 
				&& Objects.equals(num, other.num);
		*/
		return	name.equals(other.name);
	
		
	}
	

	

	
	
	
}

public class TestMeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meb	[] mArr	=	new	Meb[3];
		mArr[0]		=	new	Meb("a",null,0);
		mArr[1]		=	new	Meb("b",null,0);
		mArr[2]		=	new	Meb("c",null,0);
		
		System.out.println("list");
		for (int i = 0; i < mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		
		System.out.println(mArr[0]);
		System.out.println(mArr[1]);
		System.out.println(mArr[2]);
		//mArr[0].info();
		
		Meb		m	=	new	Meb("b", null, 0);
		System.out.println("info");
		for (int i = 0; i < mArr.length; i++) {
			if(mArr[i].equals(m))
				System.out.println(mArr[i]);
		
		
		}
		
		
		
	}

}
