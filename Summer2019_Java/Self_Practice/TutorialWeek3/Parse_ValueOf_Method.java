package TutorialWeek3;

public class Parse_ValueOf_Method {
	public static void main(String[] args) {

		int num = 3;
		String str = String.valueOf(num);// ==> "3"

		int num0 = (int) Integer.valueOf(5);
		int num1 = Integer.valueOf(5);
		int num2 = Integer.valueOf(str);
		int num3 = Integer.parseInt(str);
		int num4 = (int) Long.parseLong(str);
		int num5 = Byte.parseByte(str);
		int num6 = (int) Byte.parseByte(str);
		short a = 5;
		Integer int1 = Integer.valueOf(str);
		Integer int2 = Integer.parseInt(str);
//		Integer int3=Integer.valueOf(str);
		Integer int4 = Integer.valueOf(a);
		Integer int5 = Integer.valueOf(str);
//		
		double d1 = Double.parseDouble(str);
		double d2 = Double.valueOf(str);
		double d3 = Integer.valueOf(str);
		double d4 = Double.parseDouble(str);
		Double d5 = Double.valueOf(str);
		Double d6 = Double.valueOf(str);
//		
		String str3 = "True";
		boolean b1 = Boolean.parseBoolean("tRuE");
		Boolean b2 = Boolean.parseBoolean(str3);
		boolean b3 = Boolean.valueOf("false");
		Boolean b4 = Boolean.valueOf("5>4");
		System.out.println(b2);
//		
//		
		int num8 = 3+2+1;
		System.out.println(num8);
		Integer num7 = 456;
		char ch1 = '3';
		boolean b5 = 5 > 4;

		String s1 = String.valueOf(num8); //==>"321";
		String s2=String.valueOf(ch1);
		System.out.println(1+2+3+"A"+1);
		System.out.println(s2+1);
		System.out.println('A'+'B');
////		String s3=String.parseInt(num6);
////		String s4=String.parseInt(num7);
//		String s5=String.valueOf(ch1);
		String s6=String.valueOf(b5);
		System.out.println(s6);

	}

}
