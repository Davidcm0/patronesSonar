package alarcos.test.mediator;

import java.util.ArrayList;

import alarcos.patrones.mediator2.ATCMediator;
import alarcos.patrones.mediator2.Airplane;
import alarcos.patrones.mediator2.MyAirplane;
import alarcos.patrones.visitor.Area;
import alarcos.patrones.visitor.Circle;
import alarcos.patrones.visitor.Perimeter;
import alarcos.patrones.visitor.Rectangle;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_mediator extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_mediator(String sTestName)
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
		
		
		System.out.println("inicio del test: mediator, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			MyAirplane flight1 =  new MyAirplane();
			MyAirplane flight2 =  new MyAirplane();
			MyAirplane flight3 =  new MyAirplane();
			MyAirplane flight4 =  new MyAirplane();
			
			flight1.setFlightNumber(555);
			flight2.setFlightNumber(666);
			flight3.setFlightNumber(777);
			flight4.setFlightNumber(888);

			flight1.addColleague(flight1);
			flight1.addColleague(flight2);
			flight1.addColleague(flight3);
			flight1.addColleague(flight4);
			
			
			
			flight2.addColleague(flight1);
			flight2.addColleague(flight2);
			flight2.addColleague(flight3);
			flight2.addColleague(flight4);
			
			flight3.addColleague(flight1);
			flight3.addColleague(flight2);
			flight3.addColleague(flight3);
			flight3.addColleague(flight4);
			
			flight4.addColleague(flight1);
			flight4.addColleague(flight2);
			flight4.addColleague(flight3);
			flight4.addColleague(flight4);
			
			
			
			flight1.broadcast("HELLO from 555",flight1);
			flight2.broadcast("HELLO from 666",flight2);
			flight3.broadcast("HELLO from 777",flight3);
			flight4.broadcast("HELLO from 888",flight4);
			
		}
				
		System.out.println("fin del test: mediator, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}