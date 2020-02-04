package alarcos.test.visitor;

import java.util.ArrayList;

import alarcos.patrones.visitor.Area;
import alarcos.patrones.visitor.Circle;
import alarcos.patrones.visitor.Perimeter;
import alarcos.patrones.visitor.Rectangle;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_visitor extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_visitor(String sTestName)
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
			
			Rectangle r = new Rectangle(2,3);
			Circle c = new Circle(4);
			Perimeter p = new Perimeter();
			Area a = new Area();
			r.accept(p);
			r.accept(a);
			c.accept(p);
			c.accept(a);
			int rp = p.onRectangle(r);
			int ra = a.onRectangle(r);
			int cp = p.onCircle(c);
			int ca = a.onCircle(c);
			//System.out.println("Rectangle name: r perimeter: " + rp + " area: " + ra);
			//System.out.println("Circle name: c perimeter: " + cp + " area: " + ca);
			
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