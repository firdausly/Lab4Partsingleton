/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg17125605_1_lab3_part1;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author alang
 */
public class LoggerTestFactory {
   
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter Logging message: ");
        String message=in.nextLine();
        
        SimpleLoggerFactory simplefactory=new SimpleLoggerFactory();
        
        simplefactory.getLogger().log(message);
        
    
    
}
   
}
