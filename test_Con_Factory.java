package alarcos.test.factory;

import alarcos.patrones.factory.examples.cars.factories.CarsFactory;
import alarcos.patrones.factory.examples.cars.factories.NissanFactory;
import alarcos.patrones.factory.examples.cars.factories.ToyotaFactory;
import alarcos.patrones.factory.examples.cars.products.Car;
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;
/**
 * Created by Alberto Gordillo Rivero
 */
public class test_Con_Factory extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Con_Factory(String sTestName)
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
		
		System.out.println("inicio del test: , p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
			CarsFactory factory;
	        Car carCreated;

	        factory = new NissanFactory();

	        carCreated = factory.createProduct("tsuru");
	        assertNotNull(carCreated);
	        
	        carCreated = factory.createProduct("versa");
	        assertNotNull(carCreated );
	       

	        factory = new ToyotaFactory();

	        carCreated = factory.createProduct("corolla");
	        assertNotNull(carCreated );

	        carCreated = factory.createProduct("camry");
	        assertNotNull(carCreated );

	        carCreated = factory.createProduct("spark");
	        assertNull(carCreated );

			//Fin del test
			
		}
				
		System.out.println("fin del test: , p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}
