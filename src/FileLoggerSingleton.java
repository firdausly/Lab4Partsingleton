/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pkg17125605_1_lab3_part1;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alang
 */
public class FileLoggerSingleton implements Logger{
    private static FileLoggerSingleton uniqueInstance;
    
    private FileLoggerSingleton(){}
    
    public static FileLoggerSingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new FileLoggerSingleton();
        }
        return uniqueInstance;
    }
    
    
    @Override
    public void log(String msg) { 
        try
        {
        String filename= "src/log.txt";
        FileWriter fw = new FileWriter(filename,true); //the true will append the new data
        fw.write(timeStamp+": "+msg+"\n");//appends the string to the file
        fw.close();
        }
        catch(IOException ioe)
        {
        System.out.println("IOException: " + ioe.getMessage());
        }
        
        
    }
    
}
