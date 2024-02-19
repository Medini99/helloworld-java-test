package helloworld.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public void printStatement( boolean flag )
    {
        if(flag) {
        	System.out.println("Printing: Hello World");
            return;
        }
        System.out.println("Condition failed to print HELLO WORLD");
        	
    }
}
