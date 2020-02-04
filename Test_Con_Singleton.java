package alarcos.test.singleton;
/**
 * Created by Alberto Gordillo Rivero
 */
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;

public class Test_Con_Singleton extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public Test_Con_Singleton(String sTestName)
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
		
		System.out.println("inicio del test: singleton, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			aux = Singleton.getSingleton();
			assertTrue(aux.getEntero() >0);

			aux = Singleton.getSingleton();
			assertTrue(aux.getDoble() >0);
		

			aux = Singleton.getSingleton();
			assertTrue(aux.getCaracter() >0);
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getCadena() );
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getObj());
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getLint());
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getLdouble());
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getLchar());
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getLstring());
		

			aux = Singleton.getSingleton();
			assertNotNull(aux.getLobj());
			
			aux.close();
		}
				
		System.out.println("fin del test: singleton, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}
