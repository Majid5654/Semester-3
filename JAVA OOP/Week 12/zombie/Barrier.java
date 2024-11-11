package zombie;

public class Barrier implements Destroyable {
     private int mStrength;

    public Barrier(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }

    @Override
    public void destroyed() {
        mStrength -= (mStrength * 0.1);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + mStrength + "\n";
    }
}
