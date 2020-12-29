public class Hero implements Character {
    public String weapon = "lightsaber";
    public String test2;
    public void attack(){
        System.out.println("hero attacks the enemy");
    }

    public void heal(){
        System.out.println("The hero heals you");
    }

    public String getWeapon(){
        return weapon;
    }

}
