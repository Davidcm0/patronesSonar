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
public class test_Sin_Prototype extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Sin_Prototype(String sTestName)
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
		
		System.out.println("inicio del test: sin prototype, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
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
	        
	        
	        clonedAnimal = new Dog();
	        Dog perro2 = ((Dog)animal);
	        perro2.setColor_ojos(perro.getColor_ojos().substring(0));
	        perro2.setColor_pelo(perro.getColor_pelo().substring(0));
	        perro2.setLocalidad(perro.getLocalidad().substring(0));
	        perro2.setPatas(perro.getPatas());
	        perro2.setRaza(perro.getRaza().substring(0));
	        perro2.setIdPropietario(perro.getIdPropietario().substring(0));
	        
	        

	        animal = new Cat();
	        
	        Cat cat = ((Cat)animal);
	        cat.setColor_ojos("azules");
	        cat.setColor_pelo("blanco");
	        cat.setLocalidad("Ciudad Real");
	        cat.setPatas(4);
	        cat.setRaza("Alaska");
	        cat.setIdPropietario("Alberto");
	        
	        clonedAnimal = new Cat();
	        Cat cat2 = ((Cat)animal);
	        cat2.setColor_ojos(cat.getColor_ojos().substring(0));
	        cat2.setColor_pelo(cat.getColor_pelo().substring(0));
	        cat2.setLocalidad(cat.getLocalidad().substring(0));
	        cat2.setPatas(cat.getPatas());
	        cat2.setRaza(cat.getRaza().substring(0));
	        cat2.setIdPropietario(cat.getIdPropietario().substring(0));
	        
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