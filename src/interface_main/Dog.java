/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface_main;

/**
 *
 * @author farsam
 */
public class Dog implements Animal{
    public void  move(){
        System.out.println("move method from dog class");
    }
    public void  eat(){
        System.out.println("eat method from dog class");
    }
}
