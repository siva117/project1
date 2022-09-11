package java2;

public class StringsExcersizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		String Steve=new String("good morning");
//		         String rev="";
//
//                  for(int i=Steve.length()-1;i>=0;i--) 
//                    
//                	  rev=rev+Steve.charAt(i);
//                	  System.out.println(rev);
                  
//						String s="hello buddy how do you do";
//						  String rev=" ";
//						  
//						    for(int i=s.length()-1;i>=0;i--)
//						    	 
//						    	           rev=rev+s.charAt(i);
//						                 System.out.println(rev);
						  
	
		            String y=new String("good morning my dear buddy");
		                      String rev=" ";
		                      
		                      for(int i=y.length()-1;i>=0;i--)
		                    	  
		                    	 rev =rev+y.charAt(i);
		                          System.out.println(rev);
		                          
 // split                      
		                           String[] rt=rev.split(" ");
                                   for(String yt:rt) {
                                	   System.out.println(yt);
                                   }
// toCharArray                   	   
                                	  char[] rec=rev.toCharArray();
                                	  
                                	  for(char c:rec) {
                                		  
                                		  System.out.println(c);
                                		  
                                		  
                                	  }
                                	  
                                	   
                                   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	
	}


