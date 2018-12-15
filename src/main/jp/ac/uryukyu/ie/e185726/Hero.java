package jp.ac.uryukyu.ie.e185726;

public class Hero extends LivingThing {

    public Hero() {
        super("勇者", 10, 5);
    }

    @Override
    public void wounded(int damage) {
        setHitpoint(getHitpoint() - damage);
        if (getHitpoint() < 0) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
