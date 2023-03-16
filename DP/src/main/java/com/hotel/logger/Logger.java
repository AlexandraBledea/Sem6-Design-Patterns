package com.hotel.logger;

import java.io.*;

/**
 * Singleton design pattern (creational)
 */

public class Logger {

    private static OutputStream os;
    private static Logger logger;

    private Logger(){
        initOS();
    }

    private void initOS(){
        try{
            os = new FileOutputStream("C:\\Users\\night\\Desktop\\Facultate An 3\\Semestru 2\\Design Patterns\\Sem6-Design-Patterns\\DP\\src\\main\\java\\com\\hotel\\logger\\session_logger.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void log(String data){
        if(os == null)
            initOS();
        try{
            data += "\n";
            Logger.os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstanceOf(){
        if(Logger.logger == null){
            Logger.logger = new Logger();
        }

        return Logger.logger;
    }

}
