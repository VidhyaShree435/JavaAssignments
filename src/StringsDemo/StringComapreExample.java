package StringsDemo;

public class StringComapreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str1 = "Hello";
          String str2 = "World";
          String str3 = "Hello";
          
          int result= str1.compareTo(str2);
          
          if(result==0) {
        	  System.out.println("Str1 is equal to Str2");
          } else {
        	  System.out.println("Str1 is not equal to Str2");
          }
          
          result = str2.compareTo(str3);
          if(result==0) {
        	  System.out.println("Str2 is equal to Str3");
          } else {
        	  System.out.println("Str2 is not equal to Str3");
          }
          
          result = str3.compareTo(str1);
          if(result==0) {
        	  System.out.println("Str3 is equal to Str1");
          } else {
        	  System.out.println("Str3 is not equal to Str1");
          }
          
	}
}
