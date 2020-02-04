package alarcos.test.builder;

import alarcos.patrones.builder.examples.fastfood.Costumer;
import alarcos.patrones.builder.examples.fastfood.Meal;
import alarcos.patrones.builder.examples.heroes.Armor;
import alarcos.patrones.builder.examples.heroes.Hero;
import alarcos.patrones.builder.examples.heroes.HeroBuilder;
import alarcos.patrones.builder.examples.heroes.Profession;
import alarcos.patrones.builder.examples.heroes.Weapon;
import alarcos.patrones.singleton.Singleton;
import junit.framework.TestCase;
/**
 * Created by Alberto Gordillo Rivero
 */
public class test_Con_Builder extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Con_Builder(String sTestName)
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
		
		System.out.println("inicio del test: con builder, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
			
			//ejemplo menu
			 Costumer costumer = new Costumer();
		     costumer.orderMeal();
		     Meal meal = costumer.getMeal();
		     
		     //ejemplo heroes
		     Hero mage = new HeroBuilder(Profession.MAGE, "Riobard")
		                .withWeapon(Weapon.DAGGER)
		                .build();

		     Hero warrior = new HeroBuilder(Profession.WARRIOR, "Amberjill")
		                .withArmor(Armor.CHAIN_MAIL)
		                .withWeapon(Weapon.SWORD).build();

		     Hero thief = new HeroBuilder(Profession.THIEF, "Desmond")
		                .withWeapon(Weapon.BOW)
		                .build();

		     
		     
			//Fin del test
			
		}
				
		System.out.println("fin del test: con builder, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}