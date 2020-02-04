package alarcos.test.singleton;
/**
 * Created by Alberto Gordillo Rivero
 */
import alarcos.patrones.singleton.SinSingleton;
import junit.framework.TestCase;

public class Test_Sin_Singleton10 extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public Test_Sin_Singleton10(String sTestName)
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
		SinSingleton aux;
		
		System.out.println("inicio del test: sin singleton, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		
		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			aux = new SinSingleton();
			assertNotNull(aux.getLstring());
			
			
		
		}	
		System.out.println("fin del test: sin singleton, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}
