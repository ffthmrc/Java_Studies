package day30_ArrayList_WrapperClass;

import java.util.Arrays;


import java.util.Arrays;
public class WrapperClass {
    /*
          primitives                     wrapper-class : classes that are dedicated to primitives
            byte                            Byte            null
            short      Auto-boxing          Short           null
            int        ==========>          Integer         null
            long                            Long            null
            float                           Float           null
            double     Unboxing      	    Double          null
            boolean    <===========         Boolean         null
            char                            Character       null  
            
        
            default values of primitives:  
                    byte, short, int, long ==>0;
                    double, float ==> 0.0
                    boolean ==> false
                    char ==> space
                    
                    
     Default value of wrapper class:  null
            
     If we do not give any objects to class (reference) null will be given by defualt
            
     String's default value is also null
     */
    
    public static void main(String[] args) {
    	
    	String str1="Fatih";
    	String str2=new String("Fatih");
    	Integer num1=5; //Auto-Boxing
    	int num2=5;
    	
        int  numInt = 10;
        Integer numInteger = 10;
        int num5=Byte.parseByte("19");
        Integer num6=(int)Byte.parseByte("19"); //==> We cannot use Byte.parseByte() method for int. We have to cast it.
        //Each Wrapper Class type is only dedicated to its own type. So we cannot use byte for short, int for double, etc.
        String str19="19";
        Integer num7=Integer.parseInt(str19); //==>parseInt creates primitive type value
        Integer num8=Integer.valueOf(str19); //==>valueOf creates wrapper class object
        int num9=num8;
        double numdouble = 5.5;
        Double numDouble = 5.5;
        
        long longnum  = 20L;
        Long Longnum = longnum;   // Auto-Boxing
        System.out.println(longnum);
        System.out.println(Longnum);
        
        
        
        Boolean  BooleanResult = false;
        boolean booleanResult = BooleanResult;  // unboxing
        char ch1 = 'L';
        Character ch2 = ch1;  //  Auto-boxing
        char ch3 = ch1;  	  // none
        char ch4 = ch2;       // unboxing
        Character ch5 = ch2;  // none
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println(ch5);
        
        
        Boolean[] arr =new Boolean[3];  // [0, 0, 0]
        System.out.println(Arrays.toString(arr));
        int num12 = 10;
        //num1.MAX_VALUE();  //primitives does not have methods, variable num1 is not a reference of an object
        int num22=num1.MAX_VALUE;
        System.out.println("fff");
        System.out.println(num22);
        Integer num21 =20;
        int num3=5;
        int x = Integer.MAX_VALUE;
        
        System.out.println(x);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
        
        	
	}

}
