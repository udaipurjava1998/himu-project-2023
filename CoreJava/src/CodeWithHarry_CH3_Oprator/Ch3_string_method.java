package CodeWithHarry_CH3_Oprator;

public class Ch3_string_method {

	public static void main(String[] args) {
      String name = "sitaram";
      System.out.println("Only Strings Print = " + name);
      
      //1. Lenght 
      int value = name.length();
      System.out.println("Length Of String =" + value);
      
      //2. LowerCase String 
      String name1 = "PUROHIT";
      String lowercase = name1.toLowerCase();
      System.out.println("Uper case to lowercase  ="+ lowercase);
      
      //3. Upercase String 
      
      String uprcase = name.toUpperCase();
      System.out.println("Lower case to Upercase String = " + uprcase);
      
      
      //4. Trim Or Non Trim String 
      String nontrimString = "   BigBull    ";
      System.out.println(nontrimString);
      String trimString = nontrimString.trim();
      System.out.println(trimString);
      
      //5. name . subString method 
      System.out.println(name.substring(4));
      System.out.println(name.substring(2, 6));
      
      //6. name.replace
      System.out.println(name.replace('i','e'));
      
      //7. name. start with
      System.out.println(name.startsWith("sit"));
      
      //8.  name.endwith
      System.out.println(name.endsWith("ram"));
     
      
 
      /// thoda chepter  pending me hai 
      /// code with harry java play list 14 
      
      
    		  
     
      
      
     

	}

}
