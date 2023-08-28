
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import battle2023.ucp.Soldier;
import battle2023.ucp.Tank;

public class TankTest 
{
    @Test
    public void tank_isAlive_true_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(1);

        assertEquals(true, tank1.isAlive());
        assertTrue(tank1.isAlive());
    }
             
    @Test
    public void tank_isAlive_false_test()
    {
        Tank tank1 = new Tank();

        tank1.damage(10);

        assertEquals(false, tank1.isAlive());
        assertFalse(tank1.isAlive());
    }

    @Test 
    public void reparar()
    { 
        Tank tank1= new Tank();
        tank1.damage(5);
        tank_isAlive_false_test();
        tank_isAlive_true_test();     

    }

    @Test
    public void tank_attack_test(){
        Tank tank1=new Tank();
        Soldier s1=new Soldier();
        tank1.attack(s1);
        assertEquals(true, s1.isAlive());
        tank1.attack(s1);
        assertEquals(false, s1.isAlive());
        
    }

    @Test
    public void tank_damage_test(){
        Tank tank1=new Tank();
        tank1.damage(3);
        tank_isAlive_false_test();
        tank_isAlive_true_test();     

    }
 

    }        