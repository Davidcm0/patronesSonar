package alarcos.test.command;


import alarcos.patrones.command.Button;
import alarcos.patrones.command.Light;
import alarcos.patrones.command.LightOffCommand;
import alarcos.patrones.command.LightOnCommand;
/**
 * Created by David Carretero Martin
 */
import junit.framework.TestCase;

public class test_con_command extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_con_command(String sTestName)
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
	        Button button = new Button();
	        LightOnCommand lightOnCommand = new LightOnCommand(light);
	        LightOffCommand lightOffCommand = new LightOffCommand(light);

	        button.setCommand(lightOnCommand);
	        button.pressButton();
	        

	        button.setCommand(lightOffCommand);
	        button.pressButton();
	     
	        
			
			
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