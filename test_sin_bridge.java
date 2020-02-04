package alarcos.test.bridge;

import alarcos.patrones.bridge.Auto;
import alarcos.patrones.bridge.Bus;
import alarcos.patrones.bridge.Camion;
//import alarcos.patrones.bridge.Enchantment;
import alarcos.patrones.bridge.MotorDiesel;
import alarcos.patrones.bridge.MotorElectrico;
import alarcos.patrones.bridge.MotorGasolina;
import alarcos.patrones.bridge.MyBus;
import alarcos.patrones.bridge.MyBusElectrico;
import alarcos.patrones.bridge.MyCamion;
import alarcos.patrones.bridge.MyMotorDiesel;
import alarcos.patrones.bridge.MyMotorElectrico;
import alarcos.patrones.bridge.MyMotorGasolina;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_bridge extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_bridge(String sTestName)
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
		
		
		System.out.println("inicio del test: composite, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			//System.out.println(i);
			
			MyBus transporte1 = new MyBus(new MyMotorDiesel());
	        transporte1.prender();
	        transporte1.aumentaRevoluciones();
	        transporte1.reducirRevoluciones();
	        transporte1.apagar();
	        
	        MyBusElectrico T2 = new MyBusElectrico(new MyMotorElectrico());
	        T2.prender();
	        T2.aumentaRevoluciones();
	        T2.reducirRevoluciones();
	        T2.apagar();
	         
	        MyCamion T3 = new MyCamion(new MyMotorGasolina());
	        T3.prender();
	        T3.aumentaRevoluciones();
	        T3.reducirRevoluciones();
	        T3.apagar();
	        
	        
			
			
		}
				
		System.out.println("fin del test: composite, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}