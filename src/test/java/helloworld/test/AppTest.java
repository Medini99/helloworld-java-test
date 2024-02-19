package helloworld.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
  
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
	@Test
    public void test_method_1() {
    	App a = new App();
    	a.printStatement(true);
    }
    @Test
    public void test_method_2() {
    	App a2=new App();
    	a2.printStatement(false);
    }
}
