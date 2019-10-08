package day30_ArrayList_WrapperClass;

public class ParseMethod {
	public static void main(String[] args) {
		Integer num1=Integer.parseInt("123");  //==> Auto-Boxing
		System.out.println(num1+5);   		   //==>128
		int num2=Integer.parseInt("123");	   //==>none
		int num3=Byte.parseByte("27");
		System.out.println(num3+2);   		   //==>29
		byte bnum=(byte)Short.parseShort("20");
		System.out.println(bnum+1);   		   //==>21
		short snum=(short)Long.parseLong("2019");
		System.out.println(snum+1);   		   //==>21
		boolean B1=Boolean.parseBoolean("TrUe");
		boolean B2=Boolean.parseBoolean("5>3");
		boolean B3=Boolean.parseBoolean("1==1");
		System.out.println(B1);   		   //==>True
		System.out.println(B2);   		   //==>False (Expression is true but .parseBoolean recognize anything false apart from true...
		System.out.println(B3);   		   //==>False (Expression is true but .parseBoolean recognize anything false apart from true...
		
	
	}

}
