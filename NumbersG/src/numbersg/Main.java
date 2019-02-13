/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersg;

 
import static java.util.stream.Collectors.toList;
 


/**
 *
 * @author Lenovo
 */
public class Main {
    


    public static void main(String[] args) {

   
Permutations.of(
        1,
        2,
        3,
        4,
        5
        
)
        .map(s -> s.collect(toList())).limit(10)
        .forEach(System.out::println);
    
    
    
    Permutations.of(
       5,6,7,8,9
        
)
        .map(s -> s.collect(toList())).limit(20)
        .forEach(System.out::println);
    }
    
}
