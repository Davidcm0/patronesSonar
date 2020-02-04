package alarcos.test.mediator;

import java.util.ArrayList;

import alarcos.patrones.mediator2.ATCMediator;
import alarcos.patrones.mediator2.Airplane;
import alarcos.patrones.visitor.Area;
import alarcos.patrones.visitor.Circle;
import alarcos.patrones.visitor.Perimeter;
import alarcos.patrones.visitor.Rectangle;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_mediator extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_mediator(String sTestName)
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
		
		
		System.out.println("inicio del test: flyweight, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			ATCMediator atc = new ATCMediator();
			Airplane flight1 =  new Airplane(atc);
			Airplane flight2 =  new Airplane(atc);
			Airplane flight3 =  new Airplane(atc);
			Airplane flight4 =  new Airplane(atc);
			
			flight1.setFlightNumber(555);
			flight2.setFlightNumber(666);
			flight3.setFlightNumber(777);
			flight4.setFlightNumber(888);

			atc.addColleague(flight1);
			atc.addColleague(flight2);
			atc.addColleague(flight3);
			atc.addColleague(flight4);
			
			flight1.broadcast("HELLO from " + flight1.getFlightNumber());
			flight2.broadcast("HELLO from " + flight2.getFlightNumber());
			flight3.broadcast("HELLO from " + flight3.getFlightNumber());
			flight4.broadcast("HELLO from " + flight4.getFlightNumber());
			
		}
				
		System.out.println("fin del test: flyweight, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}