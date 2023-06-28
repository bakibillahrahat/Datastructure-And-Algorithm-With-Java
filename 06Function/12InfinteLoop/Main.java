import java.util.*;

public class Main {
    public static void infinteLoop(){
        int i = 0;
        while(true){
            System.out.println("print infinte loop");
            i++;
        }
    }
    public static void main(String[] args){
        System.out.println("Print Infinite Loop!");
        // call function
        infinteLoop();
    }
}
