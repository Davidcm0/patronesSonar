package alarcos.test.abstractfactory;

import alarcos.patrones.abstractfactory.examples.kingdom.factories.ElfKingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.factories.KingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.factories.MenKingdomFactory;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.Army;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.Castle;
import alarcos.patrones.abstractfactory.examples.kingdom.parts.King;
import alarcos.patrones.abstractfactory.examples.ufo.products.Ship;
import alarcos.patrones.abstractfactory.examples.ufo.products.UFOBossShip;
import alarcos.patrones.abstractfactory.examples.ufo.products.UFOShip;
/**
 * Created by Alberto Gordillo Rivero
 */
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;

public class test_Con_abstractfactory extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Con_abstractfactory(String sTestName)
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
		
		System.out.println("inicio del test: abstract factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			//ejemplo 1
			createKingdom(new ElfKingdomFactory());
	        createKingdom(new MenKingdomFactory());
	        
	        Ship ship;
	        String typeShip;
	        
	        //ejemplo2
	        typeShip = "ufo";
	        if(typeShip.equalsIgnoreCase("ufo")){
	            ship = new UFOShip();
	            ship.makeShip();
	            
	        }

	        typeShip = "boss";
	        if(typeShip.equalsIgnoreCase("boss")){
	            ship = new UFOBossShip();
	            ship.makeShip();
	            
	        }
			
			
		}
				
		System.out.println("fin del test: abstract factory, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	public static void createKingdom(KingdomFactory factory) {
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();

    }

}

