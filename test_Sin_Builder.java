package alarcos.test.builder;

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
public class test_Sin_Builder extends TestCase {
	private static int inicio = 0;
	private static int repeticiones = 1000000;
	private static int prueba;
	
	public test_Sin_Builder(String sTestName)
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
		
		System.out.println("inicio del test: sin builder, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
		for(int i=10 ;i>-1 ; i--) {
			Thread.sleep(1000);
			System.out.println("en: "+i+" seg");
		}
		

		for(int i=inicio; i< inicio+repeticiones ;i++) {
			
			System.out.println(i);
			//Codigo a testear
			
			//ejemplo menu
			Meal meal = new Meal();
			meal.setBurger("Cheese Burger");
			meal.setDrink("Orange Juice");
			meal.setComplement("Cheese Fingers");
			meal.setToy("Spongebob Action Figure");
			
			//ejemplo heroes
			Hero mage = new Hero();
			mage.setProfession(Profession.MAGE);
			mage.setName("Riobard");
			//mage.setArmor(armor);
			mage.setWeapon(Weapon.DAGGER);

			Hero warrior = new Hero();
			warrior.setProfession(Profession.WARRIOR);
			warrior.setName("Amberjill");
			warrior.setArmor(Armor.CHAIN_MAIL);
			warrior.setWeapon(Weapon.SWORD);

			Hero thief = new Hero();
			thief.setProfession(Profession.THIEF);
			thief.setName("Desmond");
			thief.setWeapon(Weapon.BOW);
			
			
			//Fin del test
			
		}
				
		System.out.println("fin del test: sin builder, p"+prueba+" ["+inicio+","+(inicio+repeticiones)+"]");
	}
	
	public void testNuevoAdmin() throws InterruptedException
	{
		for(prueba = 1; prueba<21 ;prueba++) {
			test();
			inicio += repeticiones;
		}
	}

}