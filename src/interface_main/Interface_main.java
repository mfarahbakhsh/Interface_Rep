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
public class Interface_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Animal d=new Dog();
       d.eat();
       d.move();
       Animal a;
    //  a.eat();
        a = new Animal() {
            
            @Override
            public void eat() {
               
                System.out.println("eat from override");
            }
            
            @Override
            public void move() {
                
                System.out.println("move from override");
                
            }
        };
        a.eat();
        a.move();
        
        Printable p=new A4();
        Showable  s=new A4();
        p.print();
        s.show();
      
    }
    
}
