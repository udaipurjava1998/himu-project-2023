 package methods;

 public class ch31_method {
      
        int adding (int x , int y) {
    	  int z;
    	  if (x>y) {
    		  z=x+y*2;
    	  }
    	  else {
    		  z=x+y-x+2+y+x;
    	  } 
		return z;
    	  
      }
	
	
	public static void main(String[] args) {
		 
	ch31_method method = new ch31_method();		
		int a = 5;
		int b = 4;
		int c;
		c = method.adding(a, b);
		
		int a1 = 8;
		int b1 = 9;
		int c1;
		c1= method.adding(a1, b1);
		
		
System.out.println(c);
System.out.println(c1);
	}
}
