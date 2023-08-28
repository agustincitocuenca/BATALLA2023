package battle2023.ucp;

import battle2023.MilitaryAsset;

public class Tank extends MilitaryAsset {

    Soldier pilot = new Soldier();

    public boolean hasPilot(){
        return pilot != null;
    }

    @Override
    public void attack(MilitaryAsset target){
        target.damage(3);
    }

    @Override
    public void damage(int value){
        setHealth(getHealth()-(value/2);
    }

}
