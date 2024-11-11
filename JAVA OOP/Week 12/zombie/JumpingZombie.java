package zombie;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int mHealth, int mLevel) {
        super.mHealth = mHealth;
        super.mLevel = mLevel;
    }

    @Override
    public void heal() {
        switch (super.mLevel) {
            case 1:
                mHealth += mHealth * 30 / 100;
                break;
            case 2:
                mHealth += mHealth * 40 / 100;
                break;
            case 3:
                mHealth += mHealth * 50 / 100;
                break;
            default:
                System.out.println("Lvl Error!");
                break;
        }
    }

    @Override
    public void destroyed() {
        super.mHealth -= (super.mHealth * 10 / 100);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\nHealth = " + mHealth + "\nLevel = " + mLevel + "\n";
    }
}
