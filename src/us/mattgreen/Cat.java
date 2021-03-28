package us.mattgreen;

/**
 * Created by mgreen14 on 12/28/17.
 */
public class Cat extends Pet implements Talkable {
    private int miceKilled;

    public Cat(int miceKilled, String name) {
        super(name);
        this.miceKilled = miceKilled;
    }

    public int getmiceKilled() {
        return miceKilled;
    }

    public void addMouse() {
        miceKilled++;
    }

    @Override
    public String talk() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " miceKilled=" + miceKilled;
    }
}

