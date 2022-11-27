package jp.ac.uryukyu.ie.e225703;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", getName(), getHitPoint(), getAttack());
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

    /**
     * モンスターの名前を設定するsetter
     * @param _name モンスターの名前
     */
    public void setName(String _name) { this.name = _name; }

    /**
     * モンスターのHPを設定するsetter
     * @param _hitpoint モンスターのHP
     */
    public void setHitPoint(int _hitpoint) { this.hitPoint = _hitpoint; }

    /**
     * モンスターの攻撃力を設定するsetter
     * @param _attack モンスターの攻撃力
     */
    public void setAttack(int _attack) { this.attack = _attack; }

    /**
     * モンスターの生死状態を設定するsetter
     * @param _dead モンスターの生死状態
     */
    public void setDead(boolean _dead) { this.dead = _dead; }

    /**
     * モンスターのHPを返すgetter
     * @return
     */
    public int getHitPoint() { return this.hitPoint; }

    /**
     * モンスターの攻撃力を返すgetter
     * @return
     */
    public int getAttack() { return this.attack; }
}