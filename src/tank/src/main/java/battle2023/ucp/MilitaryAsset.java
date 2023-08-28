package battle2023.ucp;

public abstract class MilitaryAsset {
    private int health;
    private String name;

public MilitaryAsset() {
    super();
    setHealth(5);
    setName( " bo " );
}

    protected int getHealth() {
        return health;
    }
    protected void setHealth(int health) {
        this.health = health;
    }
    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }

    public void damage(int amount){
        setHealth(getHealth()-amount);
    }

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void attack(MilitaryAsset target){
        target.damage(1);
    }
}

