package p01;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String		name1 = "a";
		String		name2 = "b";
		String		name3 = new String ("c"); 		// new heap
		String		name4 = new String ("d");		// new heap
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		 //  if (name3 == name4) 문자열 비교는 == 사용금지 
		 // heap 
		if (name1 == name2)
			System.out.println("=");
		else
			System.out.println("x");
		
		if (name3 == name4)
			System.out.println("=");
		else
			System.out.println("x");
		
		
		// data 비교 (.equals()) : if (name3.equals(name4))
		if (name1.equals(name2))
			System.out.println("=");
		else
			System.out.println("x");
		
		if (name3.equals(name4))
			System.out.println("=");
		else
			System.out.println("x");
			
		// 문자열 비교 <,> : 문자열 순서 - 정렬순
		// name5 > name6 비교 불가
		String name5 = "e";
		String name6 = "f";
		// if(name5 > name6) // 문자열 <,> 비교 불가
		if (name5.compareTo(name6) > 0) {	// name5 > name6
			System.out.println("name5");
			
		} else {
			if (name5.compareTo(name6) == 0) { // name5 == name6
				System.out.println("e==f");
			} else {
				if(name5.compareTo(name6) < 0) {
					System.out.println("e");
				}
			}
			
		}
		
		
		
		
	}

	
}
