import jp.ac.uryukyu.ie.e225703.*;

public class Main {
    public static void main(String[] args){
        //Hero hero = new Hero("勇者", 10, 5);
        Warrior warrior = new Warrior("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attack(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}