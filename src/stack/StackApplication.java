/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author JosephMac
 */
public class StackApplication {
   
    public static void main(String[] args) {
        
        Stack<String> s;
        Stack<String> a;
        String addedWord;
        String wait;
        int optionSelected = 1;
        s = new ArrayStack<>();  
        a = new LinkedStack<>();
            
        
        
        Scanner in = new Scanner(System.in);
        
        OUTER:
        do{
            System.out.println("Please select and enter from the following options: (0 to break) ");
            System.out.println("1 - Add item to stacks ");
            System.out.println("2 - Print top item on each stack ");
            System.out.println("3 - Remove top item on each stack ");
            optionSelected = in.nextInt();
            OUTER1:
            switch (optionSelected) {
                case 1:
                    System.out.println("Please enter a word to be added to the stacks: ");
                    addedWord = in.next();
                    s.push(addedWord);
                    a.push(addedWord);
                    break;
                case 2:
                    System.out.println("The top item on the Array Stack is: " + s.top());
                    System.out.println("The top item on the Linked Stack is: " + a.top());
                    break;
                case 3:
                    s.pop();
                    a.pop();
                    System.out.println("The top item on the Array Stack is now: " + s.top());
                    System.out.println("The top item on the Linked Stack is: " + a.top());
                    break;
                case 0:
                    break OUTER;
                default:
                    break;
            }
            
        }while (optionSelected != 0);
            
        }
    
    
    
}
