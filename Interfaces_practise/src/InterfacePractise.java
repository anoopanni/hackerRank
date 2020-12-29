import java.util.Random;

public class InterfacePractise {
    public static Character summonCharacter(){
        Random ran = new Random();
        if (Math.abs(ran.nextInt()) % 2 == 0){
            return new Enemy();
        }else{
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero obiWanKenobi = new Hero();
        darthVader.attack();
        obiWanKenobi.attack();
        darthVader.heal();
        obiWanKenobi.heal();
        System.out.println("Enemy Weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + obiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
        System.out.println(spy);
        char test = 'a';
        System.out.println(test);
        System.out.println(obiWanKenobi.test2);
    }

}
