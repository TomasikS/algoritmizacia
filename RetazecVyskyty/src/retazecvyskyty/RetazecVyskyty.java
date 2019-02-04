/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retazecvyskyty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 

/**
 *
 * @author Lenovo
 */
public class RetazecVyskyty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  String s = "abcdefghaaaaaPPPPPPP";
  s=s.toLowerCase();
  int index=0;
char[] array = new char[26];
 int []polo = new int [26];     
      List<Integer> list=new ArrayList<>();   
        for (char c = 'a'; c <= 'z'; c++) {
            array[index++] = c;
        }
      
       for (int i=0;i<polo.length;i++)
      polo[i]=0;
      
        for (int i=0;i<s.length()-1;i++)
        for (int j=0;j<26;j++)
        {
     if ((s.charAt(i)== array[j]) && (s.charAt(i)==s.charAt(i+1))) polo[j]=polo[j]+1;
                  
                    
  
        if (s.charAt(i)!=array[j])     polo[j]=0;
        } 
 
     
        for (int i=0;i<polo.length;i++)
        list.add(polo[i]);
        
        int indexx=0;
        
     int max=Collections.max(list);
              
for (int i=0;i<list.size();i++)
    if (list.get(i)==max) indexx=i;


System.out.println(array[indexx]);
System.out.println(max+1);
    
}}
