package alarcos.test.abstractfactory;

import alarcos.patrones.abstractfactory.examples.kingdom.parts.*;
import alarcos.patrones.abstractfactory.examples.ufo.parts.*;
import alarcos.patrones.abstractfactory.examples.ufo.products.*;
/**
 * Created by Alberto Gordillo Rivero
 */
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;

public class test_Sin_abstractfactory extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Sin_abstractfactory(String sTestName)
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
		
		System.out.println("inicio del test: sin abstract factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			//ejemplo 1
			King king = new ElfKing();
	        Castle castle = new ElfCastle();
	        Army army = new ElfArmy();
	        
	        King king2 = new MenKing();
	        Castle castle2 = new MenCastle();
	        Army army2 = new MenArmy();
	        
	        
	        Ship ship = new UFOShip();
	        ship.setName("");
	        ship.setShipEngine(new UFOEngine());
	        ship.setShipWeapon(new UFOGun());
	        
	        Ship ship2 = new UFOShip();
	        ship2.setName("");
	        ship2.setShipEngine(new UFOEngine());
	        ship2.setShipWeapon(new UFOGun());
			
		}
				
		System.out.println("fin del test: si abstract factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}


}

