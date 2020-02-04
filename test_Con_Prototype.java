package alarcos.test.prototype;

import alarcos.patrones.prototype.examples.animals.Animal;
import alarcos.patrones.prototype.examples.animals.AnimalCloneFactory;
import alarcos.patrones.prototype.examples.animals.Cat;
import alarcos.patrones.prototype.examples.animals.Dog;
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;
/**
 * Created by Alberto Gordillo Rivero
 */
public class test_Con_Prototype extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Con_Prototype(String sTestName)
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
		
		System.out.println("inicio del test: con prototype, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
			AnimalCloneFactory factory = new AnimalCloneFactory();
	        Animal animal;
	        Animal clonedAnimal;


	        animal = new Dog();
	        Dog perro = ((Dog)animal);
	        perro.setColor_ojos("azules");
	        perro.setColor_pelo("blanco");
	        perro.setLocalidad("Ciudad Real");
	        perro.setPatas(4);
	        perro.setRaza("Alaska");
	        perro.setIdPropietario("Alberto");
	        
	        
	        clonedAnimal = (Dog) factory.getClone(animal);

	        animal = new Cat();
	        
	        Cat cat = ((Cat)animal);
	        cat.setColor_ojos("azules");
	        cat.setColor_pelo("blanco");
	        cat.setLocalidad("Ciudad Real");
	        cat.setPatas(4);
	        cat.setRaza("Alaska");
	        cat.setIdPropietario("Alberto");
	        
	        clonedAnimal = (Cat) factory.getClone(animal);
	        
			//Fin del test
			
		}
				
		System.out.println("fin del test: sin prototype, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}