package zombie;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int mHealt, int mLevel) {
        super.mHealth = mHealt;
        super.mLevel = mLevel;
    }

    @Override
    public void heal() {
        switch (super.mLevel) {
            case 1:
                mHealth += mHealth * 20 / 100;
                break;
            case 2:
                mHealth += mHealth * 30 / 100;
                break;
            case 3:
                mHealth += mHealth * 40 / 100;
                break;
            default:
                System.out.println("Lvl Error!");
                break;
        }
    }

    @Override
    public void destroyed() {
        super.mHealth -= (super.mHealth * 20 / 100);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth = " + super.mHealth + "\nLevel = " + super.mLevel + "\n";
    }
}
