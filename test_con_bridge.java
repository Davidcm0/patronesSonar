package alarcos.test.bridge;

import alarcos.patrones.bridge.Auto;
import alarcos.patrones.bridge.Bus;
import alarcos.patrones.bridge.Camion;
//import alarcos.patrones.bridge.Enchantment;
import alarcos.patrones.bridge.MotorDiesel;
import alarcos.patrones.bridge.MotorElectrico;
import alarcos.patrones.bridge.MotorGasolina;

/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_bridge extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_bridge(String sTestName)
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
			
			//System.out.println(i);
			
			Auto transporte1 = new Bus(new MotorElectrico());
	        transporte1.arrancar();
	        transporte1.acelerar();
	        transporte1.frenar();
	        transporte1.detener();
	        
	        Auto T2 = new Bus(new MotorDiesel());
	        T2.arrancar();
	        T2.acelerar();
	        T2.frenar();
	        T2.detener();
	         
	        Auto T3 = new Camion(new MotorGasolina());
	        T3.arrancar();
	        T3.acelerar();
	        T3.frenar();
	        T3.detener();
	        
			
			
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
