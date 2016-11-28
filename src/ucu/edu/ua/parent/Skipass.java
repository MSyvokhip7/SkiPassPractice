package ucu.edu.ua.parent;

import ucu.edu.ua.SkipassSpec;

/**
 * Created by TheOriginMS7 on 28.11.2016.
 */
public class Skipass {
    protected SkipassSpec spec;
    private long id;
    private boolean blocked;

    public Skipass(SkipassSpec skipassSpec, long id, boolean blocked) {
        this.spec = skipassSpec;
        this.id = id;
        this.blocked = blocked;
    }

    public void UserID(long id){
        this.id = id;
    }

    public SkipassSpec getSpec() {
        return spec;
    }

    public long getId() {
        return id;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Id of client is " + id + ", Type of card " + getSpec();
    }
}
