package p05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// length
		System.out.println("length:" + "hello".length());			// 5
		System.out.println("length:" + "안녕하세요".length());		// 5
		
		// charAt
		//					012345	6	7	8	9
		String	str		=	"java programming";
		System.out.println("1"+ str.charAt(1));
		System.out.println("5"+ str.charAt(5));
		
		
		// substring
		//					012345	6	7	8	9
		String	str2	=	"hello ~";
		System.out.println("substring \n" + str2.substring(0, 4+1));	//0~4
		System.out.println("" + str2.substring(0, 5));		//0~5
		System.out.println("" + str2.substring(6));			//6~(10+1)
		
		// indexOf / lastIndexOf
		String	str3	=	"apple";
		System.out.printf("", str3.indexOf("a"));			// 1
		System.out.printf("", str3.indexOf("a", 2));		// 3
		System.out.printf("", str3.lastIndexOf("a"));		// 5
		
		// contains 포함
		String	str4	=	"apple";
		System.out.println("" + str4.contains(str4));
		System.out.println("le" + str4.contains("le"));
		
		// startsWith 시작되는 문자
		String	str5	=	"java";
		System.out.println("" + str5.startsWith(str5));
		System.out.println("j" + str5.startsWith("j"));
		System.out.println("j" + str5.indexOf("j"));
		
		// endsWith 끝나는 문자
		String	str6	=	"file.java";
		System.out.println("" + str6.endsWith("java"));
		
		// equals / equalsIgnoreCase 문자열 비교
		String	str7	=	"Java";
		String	str8	=	"java";
		System.out.println(str7.equals(str8));				//
		System.out.println(str7.equalsIgnoreCase(str8));	//대소문자
		
		// toUpperCase toLowerCase 대소문자 변환
		System.out.println(str7.toUpperCase());
		System.out.println(str7.toLowerCase());
		
		
		// length trim 앞 뒤 공백 제거
		String	str9	=	"     aa     ";
		System.out.println(str9);
		System.out.println(str9.length());
		
		System.out.println(str9.trim());
		System.out.println(str9.trim().length());
		
		// replace 문자열 변경
		String	str10	=	"java";
		System.out.println(str10);		// java
		String	str10x	=	str10.replace("java", "python");	// python
		System.out.println(str10x);		// python
		System.out.println(str10.replace("java", "python"));	// java
		str10		=	str10.replace("java", "python");		// python
		System.out.println(str10);		//python
		
		//  split 문자열 구분
		String	str11	=	"r,g,b";
		System.out.println(str11);			// r,g,b
		String	[] colorArr	=	str11.split(",");
		System.out.println(colorArr);		// [Ljava.lang.String;@18b4aac2
		
		System.out.println(Arrays.toString(colorArr));	// [r, g, b]
		System.out.println(colorArr[0]);	// r
		System.out.println(colorArr[1]);	// g
		System.out.println(colorArr[2]);	// b
		
		//	isEmpty / isBlank(java11+)
		String	empty	=	"";			// length() : 0
		String	blank	=	" ";		// length() : 1 	(java11+)
		
		System.out.println(empty.isEmpty());
		System.out.println(empty.isBlank());
		
		// String.format
		String	name 	=	"";
		int		num		=	20;
		String	msg		=	String.format("name:%s",
				name, args);
		System.out.println(msg);
		
		String	msg2	=	MessageFormat.format("name:{0}", 
							name,num);
		System.out.println(msg);
		
		// join CharSequence
		// String	result	=	String.join("-", colorArr);
		String	result	=	String.join("-", colorArr);
		System.out.println(result);
		
		String	result2	=	String.join("-", "2026","10","29");
		System.out.println(result2);
		
		// repeat
		String	star	=	"*";
		System.out.println(star.repeat(5));
		
		
	}

}
