package alarcos.test.proxy2;

import alarcos.patrones.proxy2.Intermediario;
import alarcos.patrones.proxy2.Proxy;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_proxy extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_proxy(String sTestName)
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
		
		
		System.out.println("inicio del test: proxy, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			Proxy sujeito = new Intermediario();
			sujeito.Acesso("www.google.com");
			sujeito.Acesso("www.google.com");
	       
	    
			
			
		}
				
		System.out.println("fin del test: proxy, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}