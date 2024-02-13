/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author VI
 */
public class Stamp {
    String text ="RMUTT";
    int numOfStamp = 3;
    
    void stamp(){
        if(numOfStamp >0) { 
            System.out.println(text);
            numOfStamp--;
        }else
            System.out.println("Run out of the ink,please refill!!!");   
    }
        void maxFill(){
        numOfStamp = 3;
    }
}
