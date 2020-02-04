package alarcos.test.strategy;

import alarcos.patrones.strategy.examples.robot.AgressiveBehavior;
import alarcos.patrones.strategy.examples.robot.DefensiveBehavior;
import alarcos.patrones.strategy.examples.robot.Robot;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_strategy extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_strategy(String sTestName)
	{
		super(sTestName);
	}

	public void setUp() throws Exception
	{
	}

	public void tearDown() throws Exception
	{
	}

	private void test() throws InterruptedException
	{
		
		
		System.out.println("inicio del test: bridge, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			Robot roboto = new Robot();
	        roboto.setName("Mr. Roboto");
	        roboto.setBehavior(new AgressiveBehavior());

	        roboto.move();
	        roboto.setBehavior(new DefensiveBehavior());
	        roboto.move();
	    
			
			
			
		}
				
		System.out.println("fin del test: bridge, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}