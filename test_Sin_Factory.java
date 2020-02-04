package alarcos.test.factory;


import alarcos.patrones.factory.examples.cars.products.*;
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;
/**
 * Created by Alberto Gordillo Rivero
 */
public class test_Sin_Factory extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Sin_Factory(String sTestName)
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
		Singleton aux;
		
		System.out.println("inicio del test: sin factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
	        Car carCreated;


	        carCreated = new Tsuru();;
	        assertNotNull(carCreated);
	        
	        
	        carCreated = new Versa();
	        assertNotNull(carCreated );
	        

	        carCreated = new Corolla();
	        assertNotNull(carCreated );

	        carCreated = new Camry();
	        assertNotNull(carCreated );

	        
			//Fin del test
			
		}
				
		System.out.println("fin del test: sin factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}