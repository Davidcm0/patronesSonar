package alarcos.test.composite;

import alarcos.patrones.composite.examples.directories.Directory;
import alarcos.patrones.composite.examples.directories.File;
import alarcos.patrones.composite.examples.directories.FileSystem;
import alarcos.patrones.composite.examples.directories.MyDirectory;
import alarcos.patrones.composite.examples.directories.MySImpleFile;
import alarcos.patrones.composite.examples.directories.SimpleFile;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_composite extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_composite(String sTestName)
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
			
			MyDirectory home = new MyDirectory("home");
			MyDirectory opt  = new MyDirectory("opt");
			MyDirectory usr = new MyDirectory("usr");

			MyDirectory root = new MyDirectory("root");

	        root.addDirectory(home);
	        root.addDirectory(opt);
	        root.addDirectory(usr);

	        usr.addFile(new MySImpleFile("bin"));
	        usr.addFile(new MySImpleFile("lib"));

	        opt.addFile(new MySImpleFile("google"));
	        opt.addFile(new MySImpleFile("idea"));
	        opt.addFile(new MySImpleFile("spotify"));

	        home.addFile(new MySImpleFile("luisburgos"));
			
			
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
