package jp.ac.uryukyu.ie.e185726;

public class LivingThing {
    private String name;
    private int hitpoint;
    private boolean dead;
    private int attack;

    public LivingThing (String name,int maximumHP,int attack) {
        this.name = name;
        hitpoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n",name,maximumHP,attack);
    }

    public void attack(LivingThing opponent) {
        if(!isDead()){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n",name,opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitpoint -= damage;
        if( hitpoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた！\n",name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack){
        this.attack = attack;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

}