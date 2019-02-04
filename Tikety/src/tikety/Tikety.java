/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikety;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


 


/**
 *
 * @author Lenovo
 */
public class Tikety {

    /**
     * @param args the command line arguments
     */
   static int[][] pole=new int[31][6];
    
   static int[] cislo=new int[6];
     static int[] cislo2=new int[6];
    
    public static int []generate()
    {
      Random Random = new Random();
      
      cislo[0]=Random.nextInt(1)+1;
     cislo[1]=Random.nextInt(2)+3;
     cislo[2]=Random.nextInt(2)+5;
     cislo[3]=Random.nextInt(3)+6;
     cislo[4]=Random.nextInt(2)+8;
    
      
      
      Arrays.sort(cislo);
      
      
      
      
  /*    int p=Random.nextInt(7);
            ArrayList<Integer> arr = new ArrayList<>();
    List<Integer> arr2 = new ArrayList<>();
      
       
             for (int i = 0; i < 11; i++) 
             
                 arr.add(i,i);
       arr2=arr.subList(p,p+5 );
       
       
     
       
       shuffle(arr2);
       
      for (int i = 0; i < 5; i++)
     cislo[i]=arr2.get(i);
Arrays.sort(cislo);

cislo[4]=cislo[0]+1;
cislo[3]=cislo[2]-1;


  for (int i = 0; i < 5; i++)
if(cislo[i]==cislo[4]) cislo[i]=Random.nextInt(cislo[4])+3;
  
    for (int i = 0; i < 5; i++)
if(cislo[i]==cislo[3])cislo[i]=Random.nextInt(cislo[4])+3;                              
//if (cislo.length<=4) for (int i = 0; i < 5; i++) cislo[i]=arr2.get(i);*/
 

  return cislo;
    }
     
 public static void shuffle(List<Integer> a) {
    int n = a.size();
    Random random = new Random();
    random.nextInt();
    for (int i = 0; i < n; i++) {
      int change = i + random.nextInt(n - i);
      swap(a, i, change);
    }
  }

  private static void swap(List<Integer> a, int i, int change) {
    int helper = a.get(i);
    a.set(i, a.get(change));
    a.set(change, helper);
  }
    public static boolean compare(int e[][], int []cislo){
        boolean pravda = false;
     int c=0;
  int []cislo2 = new int [6];
 int pom=0;
          for (int i=0;i<30;i++){
                  /// for (int j=0;j<30;j++) {
                      for (int k=0;k<5;k++)
                     //  if (e[i][0]==e[j][0]) pravda=false ;
                      //   if (e[i][1]==e[j][1]) pravda=false ;
                                                  if (e[i][k]==e[i+1][k]) pravda=true ;
                                                  else pravda=false;
                   }///}
                       
           
       return  pravda;

}
    
    
    
    public static void main(String[] args) {
     cislo = generate();
     Arrays.sort(cislo);
       
    for(int k=0;k<5;k++) pole[0][k]=cislo[k];
     
   
     int i=1;
     
     
     while(i<=30)
     {
     
        cislo = generate();    
Arrays.sort(cislo);
        
///  boolean j= compare(pole,cislo);
   /// if (j==false) {
     
    //    cislo = generate(); 
    // }
     
   ///  if (j==true) {
        //Arrays.sort(cislo);
       for(int jj=0;jj<cislo.length;jj++)  
           
           pole[i][jj]=cislo[jj];
          
     i++;
     
     int index; int counter=0;
     
       for(int jjj=0;jjj<30;jjj++) 
     for(int jj=0;jj<30;jj++) 
            for(int k=0;k<5;k++) 
              
                
  if(pole[jj][k]==pole[jj+1][k])  
      
       {index=jj; 
     counter++;
     
     
     
     if (counter >=2)
     {
     cislo=generate(); 
     
//     for(int uk=0;uk<5;uk++) 

pole[index][k]=cislo[k];
     
     
     } }
      
      
      
      
      
       /* for(int jjj=0;jjj<30;jjj++) 
     for(int jj=0;jj<30;jj++) 
            for(int k=0;k<5;k++) 
      
                
   if(pole[jj][k]==pole[jjj][k])    {index=jj; 
     
     
     
     
     if (counter >=2)
     
     cislo=generate();//Arrays.sort(cislo);
     
     for(int uk=0;uk<5;uk++)   pole[index][uk]=cislo[uk];
     
     
     }*/
     
     
     }
   //  }
     

          for(int jjj=0;jjj<30;jjj++) 
     for(int jj=0;jj<5;jj++) 
         
         cislo2[jj]=pole[jjj][jj];
          
               // for(int ijj=0;ijj<5;ijj++) 
             for(int jj=0;jj<5;jj++) 
         if(cislo2[jj] ==cislo2[jj+1] ) cislo2[jj+1]=cislo[jj+1]+5;
          
             
             if(cislo[2]==cislo[3]) cislo[3]=cislo[3]+2;
             
     for(int l=0;l<30;l++) {
       for(int j=0;j<5;j++){
           cislo2[j]=pole[l][j];
     Arrays.sort(cislo2);
     System.out.print( cislo2[j]+ "\t" );
     }
     
       System.out.println( "" );
     }  
     

   
    
}}
