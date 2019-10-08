package day33_Methods_ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
public static void main(String[] args) {
	ArrayList<String> names=new ArrayList();
	names.add("Yusuf");
	names.add("Betul");
	names.add("Defne");
	names.add("Ela");
	names.add(2,"Murat");
	names.add("Murat");
	System.out.println(names);
	System.out.println(names.get(3));
	for(String each:names) {
		System.out.print(each+" ");
	}
	System.out.println();
	for (int i = 0; i < names.size(); i++) {
		System.out.print(names.get(i)+" ");
	}
	System.out.println();
	for (int i = names.size()-1; i>=0; i--) {
		System.out.print(names.get(i)+" ");
	}
	System.out.println();
	Collections.sort(names);
	System.out.println(names);
	
	ArrayList<String> javengers=new ArrayList<>();
	javengers.add("Ekrem");
	javengers.add("Osman");
	javengers.add("Fatih");
	javengers.add("Mehmet");
	javengers.add("Yasin"); 
	System.out.println(javengers);
	//javengers.set(5,"Yusuf");==>gives out of bounds exception
	System.out.println(javengers);
	boolean b1=javengers.contains("Osman");
	System.out.println(b1);
	boolean b2=javengers.get(0).equals("Ekrem");
	System.out.println(b2);
}
}
