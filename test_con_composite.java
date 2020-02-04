package alarcos.test.composite;

import alarcos.patrones.composite.examples.directories.Directory;
import alarcos.patrones.composite.examples.directories.File;
import alarcos.patrones.composite.examples.directories.FileSystem;
import alarcos.patrones.composite.examples.directories.SimpleFile;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_composite extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_composite(String sTestName)
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
			
			System.out.println(i);
			
			File home = new Directory("home");
	        File opt  = new Directory("opt");
	        File usr = new Directory("usr");

	        File root = new Directory("root");

	        root.add(home);
	        root.add(opt);
	        root.add(usr);

	        usr.add(new SimpleFile("bin"));
	        usr.add(new SimpleFile("lib"));

	        opt.add(new SimpleFile("google"));
	        opt.add(new SimpleFile("idea"));
	        opt.add(new SimpleFile("spotify"));

	        home.add(new SimpleFile("luisburgos"));

	       
	        
			
			
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
