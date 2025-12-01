import java.util.*;
import java.lang.System;


public class Logger{
    static void main() {
        Logges var_1 = new Logges();
        var_1.log("This is a simple log message.");
        var_1.log("This is a warning message.", 2);
        var_1.log("An error occurred while processing the request.", new IllegalArgumentException("Invalid argument provided."));

    }
}


class Logges{
    void log(String message){
        System.out.println(message);
    }
    void log(String message,int level){
        System.out.println("Level: "+level+" Message: "+message);
    }
    void log(String message, Throwable error){
        System.out.println("[ERROR] " + message);
        System.out.println("Cause: " + error.getClass().getSimpleName()
                + " - " + error.getMessage());
    }
}
