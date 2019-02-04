/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingtwonumber;

import java.util.Random;



/**
 *
 * @author Lenovo
 */
public class AddingTwoNumber {

    /**
     * @param args the command line arguments
     */
    
     static String  Z ="1234567890";
    
    static String findSum(String str1, String str2)  
{  
     
        String str = "";  
  
     if (str1.length() > str2.length()){ 
        String t = str1; 
        str1 = str2; 
        str2 = t; 
    } 
    int n1 = str1.length(), n2 = str2.length();  
  
   
    str1=new StringBuilder(str1).reverse().toString(); 
    str2=new StringBuilder(str2).reverse().toString(); 
  
    int carry = 0;  
    for (int i = 0; i < n1; i++)  
    {  

        int sum = ((int)(str1.charAt(i) - '0') +  
                    (int)(str2.charAt(i) - '0') + carry);  
        str += (char)(sum % 10 + '0');  
  
      
        carry = sum / 10;  
    }  
  

    for (int i = n1; i < n2; i++)  
    {  
        int sum = ((int)(str2.charAt(i) - '0') + carry);  
        str += (char)(sum % 10 + '0');  
        carry = sum / 10;  
    }  
  
  
    if (carry > 0)  
        str += (char)(carry + '0');  
  

    str = new StringBuilder(str).reverse().toString(); 
  
    return str;  
}  


    
    public static void main(String[] args) {
        
    AddingTwoNumber rs = new AddingTwoNumber();
    
  String s1=rs.generateString(new Random(), Z, 200);
     String s2=rs.generateString(new Random(), Z, 200);

     

    System.out.println(s1) ;
      System.out.println() ;
    
     System.out.println(s2) ;
     System.out.println() ;
     
     String v=(findSum(s1,s2)) ;
     System.out.println() ;
     System.out.println(v) ;
     System.out.println() ;
   //  System.out.println(v.length()) ;
System.out.println() ;
    }
    
    public String generateString(Random random, String characters, int length) {
        char[] text = new char[length];
        for (int i = 1; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        
        text[0]= characters.charAt(random.nextInt(characters.length()-1));
        
        return new String(text);
    }
    
    
    
 
    
}
