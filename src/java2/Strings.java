package java2;



public class Strings{
	
	
	public static void main(String[] args) {
		
		
		
//		String text="iyyiuqyiuyiiyiuiuyu";
//		System.out.println("the length of the above string is "+text.length());
//		
//		
//		System.out.println(text.toUpperCase());
//		System.out.println(text.toLowerCase());
		
//		The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string 
//		(including whitespace):
		
		
//	String began=new String ("accumulation");
//	System.out.println(began.indexOf("m"));
//    System.out.println(began.indexOf("c"));
		
		
//	Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

//You can also use the concat() method to concatenate two strings:
           
//    String firstname="mission";
//    String lastname="possible";
//    
//    System.out.println(firstname+" "+lastname);
//    System.out.println(firstname.concat(lastname));
    
    
    
    
    
    
    
//    String st="10";
//    String rt="20";
//    System.out.println(st+rt);
    
//    String st="10";
//    int i=20;
//    System.out.println(st+i);
    
  
		
//		String name="mission impossible";
    
    
//         System.out.println(name.charAt(6));
// Returns the character at the specified index (position)
//           System.out.println(name.charAt(10));
    
    
//    System.out.println(name.codePointAt(3));
//    Returns the Unicode of the character at the specified index
    
  //  System.out.println("value of "+name.codePointBefore(3));                  //o/p= character value=115
 //  Returns the Unicode of the character before the specified index
    
//    System.out.println(name.codePointCount(8, 13));   
//   Returns the Unicode in the specified text range of this String 
//    (it will give the indexes count in the specified range)
		
	    	String name2="missioin";
//        System.out.println(name.compareTo(name2));
//		Compares two strings lexicographically
//		System.out.println(name.compareToIgnoreCase(name2));
//	    	Compares two strings lexicographically, ignoring case differences
    
//    System.out.println(name2.isEmpty());
//    System.out.println(name.isBlank());
//    Checks whether a string is empty or not	
    
//        System.out.println(name2.lastIndexOf("s")); 
//    Returns the position of the last found occurrence of specified characters in a string	
	    	
//	    	System.out.println(name.indexOf("s"));
//	    	Returns the position of the first found occurrence of specified characters in a string	
	    	
//	    	System.out.println(name2.length());
//	    	Returns the length of a specified string	
	    	
//	    	String thin="goood morning buddy";
//	    	String thick="good evening brother";
//	    	System.out.println(thin.replace('d', 'f'));
//	    	System.out.println(thin.replace('o', 'a'));
//	    	System.out.println(thin.replace('g', 't'));
//          System.out.println(thin.replace('d', 'e'));
//	    	The replace() method searches a string for a specified character, 
//	    	and returns a new string where the specified character(s) are replaced.
	    	
//                 System.out.println("after replacing buddy with friend :");
//                 System.out.println(thin.replaceFirst("buddy","friend"));
                  
//                 System.out.println(thin.replaceAll(thin,thick));
//                 System.out.println(thin.replaceAll("thin","thick"));
                 
//                 In the following example we are demonstrating the use of replaceFirst() method. 
//                 This method replaces the part of a string with a new specified string. 
//                 The difference between replaceFirst() and replaceAll() method is that the replaceFirst() replaces the first occurrence
//                 while replaceAll() replaces all the occurrences.

//                 The difference between replace() and replaceAll() method is that the replace() method replaces all the occurrences of old char with new char 
//                 while replaceAll() method replaces all the occurrences of old string with the new string. Basically replace() works with replacing chars and replaceAll() works with replacing part of strings.


    
             	String str = new String("My .com site is BeginnersBook.com");
//            	System.out.print("String after replacing all com with in: " );
//            	System.out.println(str.replaceAll("com", "in"));
            		
//                 System.out.println(str.replaceFirst("com", "come"));
 
//                   System.out.println(str.replaceAll("(.*)site(.*)", "mellcow"));
//                 (.*) it will helps us to ,if we write"(.*)beginner",up to bignner string will be replaced like this,
//                   "mellcoow Book.com",if we write"(.*)site(.*)" entire string will be replsced with "mellcow".
      
    
    
//                     System.out.println(str.contains(" "));
//             Checks whether a string contains a sequence of characters
             	
//                 System.out.println(str);
//	            System.out.println(str.trim());
//		Removes whitespace from both ends of a string
             	
//	        	System.out.println(str.substring(15));
//		after the specified index string will be printed
//		Returns a new string which is the substring of a specified string	
	        	
//	        	System.out.println(str.toString());
//		Returns the value of a String object	
             	
//             	System.out.println(str.valueOf("site"));
//             	Returns the string representation of the specified value	
             	
//             	System.out.println(str.startsWith("My"));
//             	Checks whether a string starts with specified characters	,
//             	System.out.println(str.endsWith("com"));
             	
             	///////  split method  /////////
             	
//             	String sp=new String("hello jave good to see you again");
//             	          String[] give =sp.split(" ");
////             	          String[] give=sp.split(" ", 4); //we can put the string(parts) limit
//             	          for(String get: give){ 
//             	          
//             	          System.out.println(get);
//             	          
//             	          }
//             	//////////////to CharArray()/////////////////
//             	                 char[] chararray =sp.toCharArray();
//             	                 for(char c: chararray){
//             	                	 
//             	                	 System.out.println(c);
//             	                 }
//             	                 
//             	               
//             	                 String bet="good morning my dear friend"; 
//             	                 
//             	                 char[] take=bet.toCharArray();
//             	                 
//             	                  for(char t:take) {
//             	                	  System.out.println(t);
//             	                  }
             	                 
//                     Converts this string to a new character array	    	                 
             	                 
             	                 
             	
             	
             	String get = "Elon is the world wealth creator";
             	
             	      System.out.println(get.replace('l', 'o'));
             	      
             	
             	
             	
             	
             	
             	
             	
             	
	        	
	        	
	        	
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
