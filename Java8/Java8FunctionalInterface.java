package java8;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  
@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg);   // abstract method  
}  
public class Java8FunctionalInterface implements Sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	Java8FunctionalInterface fie = new Java8FunctionalInterface();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  