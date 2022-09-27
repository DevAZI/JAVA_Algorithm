package project;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("a의 값 :"); int a = scanner.nextInt();
        System.out.print("b의 값 :"); int b = scanner.nextInt();
        System.out.print("c의 값 :"); int c = scanner.nextInt();
        
        int max = a;
        if(b > max)
        {
            max =b;
        }
        if( c> max )
        {
            max = c;
        }
        
        System.out.print(max + "이게 최대값임");
        
        
        
    	
        
    }

}