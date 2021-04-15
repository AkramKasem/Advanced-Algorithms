/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

/**
 *
 * @author akram
 */
public class Adapter {
    
    int node [] ;
    public Adapter(int N){
        node = new int[N] ;
        for (int i = 0; i < node.length; i++) {
            node[i] = i ;            
        }
    }
    
    public void Union(int a , int b){
               
        if (!connected (a , b)) {
            node [a] = node [b] ;
        }      
        
    }
    public  boolean connected (int a , int b){
        if (node [a] == node [b]) {
            return true;
        }
        return false;
    }
    
    
}
