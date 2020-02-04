package alarcos.test.command;


import alarcos.patrones.command.Button;
import alarcos.patrones.command.Light;
import alarcos.patrones.command.LightOffCommand;
import alarcos.patrones.command.LightOnCommand;
import alarcos.patrones.command.MyButtonOff;
import alarcos.patrones.command.MyButtonOn;
import alarcos.patrones.command.MyLightOff;
import alarcos.patrones.command.MyLightOn;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_sin_command extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_sin_command(String sTestName)
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
		
		
		System.out.println("inicio del test: command, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			
			Light light = new Light();
	        MyButtonOn button = new MyButtonOn();
	        MyButtonOff button2 = new MyButtonOff();
	        MyLightOn lightOnCommand = new MyLightOn(light);
	        MyLightOff lightOffCommand = new MyLightOff(light);

	        button.setCommand(lightOnCommand);
	        button.pressButton();
	        

	        button2.setCommand(lightOffCommand);
	        button2.pressButton();
	        
			
			
		}
				
		System.out.println("fin del test: command, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}
	

}