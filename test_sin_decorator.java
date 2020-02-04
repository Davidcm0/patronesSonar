package alarcos.test.decorator;

import alarcos.patrones.decorator.examples.pizzas.MyRelojBase;
import alarcos.patrones.decorator.examples.pizzas.MyRelojMyS;
import alarcos.patrones.decorator.examples.pizzas.RelojBase;
import alarcos.patrones.decorator.examples.pizzas.RelojMyS;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_decorator extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_decorator(String sTestName)
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
		
		
		System.out.println("inicio del test: decorator, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			MyRelojBase reloj = new MyRelojBase();
	        reloj.mostrarHora();
	        
	        MyRelojMyS r = new MyRelojMyS();
	        r.mostrarHora();
			
			
		}
				
		System.out.println("fin del test: decorator, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}
