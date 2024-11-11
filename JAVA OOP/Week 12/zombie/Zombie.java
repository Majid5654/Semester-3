package zombie;

public abstract class Zombie implements Destroyable {
    protected int mHealth;
    protected int mLevel;

    public abstract void heal();

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "";
    }
}
