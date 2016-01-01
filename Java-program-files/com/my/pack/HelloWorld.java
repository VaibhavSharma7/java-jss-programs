package com.my.pack;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Date;

public class HelloWorld {


    public static void main(String arr[]) {

        //Reference of Nashorn Script Engine :
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            engine.eval("print('Hello World! directly from main()')"); //Directly executing js code.

            engine.eval(new FileReader("javascript-program-files/script.js")); //Directly executing code in js file.

            Invocable invocable = (Invocable) engine;

            Object result = invocable.invokeFunction("fun1", "Vaibhav Sharma");
            System.out.println(result);
            System.out.println(result.getClass());

            invocable.invokeFunction("fun2", new Date());
            invocable.invokeFunction("fun2", LocalDateTime.now());
            invocable.invokeFunction("fun2", new Person());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String staticFunction(String name) {
        System.out.println("Hi there from Java Static Function ," + name);
        return "greetings from java";
    }


    public String nonStaticFunction(String name) {
        System.out.println("Hi there from Java Non Static Function ," + name);
        return "greetings from java";
    }

}

class Person {}
