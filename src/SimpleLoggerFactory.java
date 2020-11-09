
import java.io.IOException;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
public class SimpleLoggerFactory {
     public static boolean isFileLoggingEnabled(){
        Properties p=new Properties();
        try {
            p.load(ClassLoader.getSystemResourceAsStream("logger.properties"));
            
            String fileLoggingValue= p.getProperty("FileLogging");
     
            return fileLoggingValue.equalsIgnoreCase("ON");
        } catch(IOException e){
            return false;
        }
    }
     
    public Logger getLogger(){
     Logger logger=null;
        if(isFileLoggingEnabled()){
         logger=FileLoggerSingleton.getInstance();
     } else {
         logger= new ConsoleLogger();
     }  
        return logger;
    }
}
