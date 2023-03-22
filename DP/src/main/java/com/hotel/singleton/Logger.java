package com.hotel.singleton;

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
            os = new FileOutputStream("log\\session_logger.txt");

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
