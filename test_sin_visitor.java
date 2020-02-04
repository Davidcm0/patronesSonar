package alarcos.test.visitor;

import java.util.ArrayList;

import alarcos.patrones.visitor.Area;
import alarcos.patrones.visitor.Circle;
import alarcos.patrones.visitor.MyArea;
import alarcos.patrones.visitor.MyCircle;
import alarcos.patrones.visitor.MyPerimeter;
import alarcos.patrones.visitor.MyRectangle;
import alarcos.patrones.visitor.Perimeter;
import alarcos.patrones.visitor.Rectangle;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_visitor extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_visitor(String sTestName)
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
		
		
		System.out.println("inicio del test: visitor, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			MyRectangle r = new MyRectangle(2,3);
			MyCircle c = new MyCircle(4);
			MyPerimeter p = new MyPerimeter();
			MyArea a = new MyArea();
			int rp = p.onRectangle(r);
			int ra = a.onRectangle(r);
			int cp = p.onCircle(c);
			int ca = a.onCircle(c);
			//System.out.println("Rectangle name: r perimeter: " + rp + " area: " + ra);
			//System.out.println("Circle name: c perimeter: " + cp + " area: " + ca);
			
		}
				
		System.out.println("fin del test: visitor, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}