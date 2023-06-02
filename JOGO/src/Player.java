public class Player extends PlayerGen{

    private int live;
    private boolean invencible;

    public Player(){}

    public Player(int x, int y, int direction) {
        super(x, y, direction);
    }

    public boolean colide(Gameobject object){
        return (this.getX() == object.getX() && this.getY() == object.getY());
    }
    public void damage() {
        live--;
    }
    
    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public boolean isInvencible() {
        return invencible;
    }

    public void setInvencible(boolean invencible) {
        this.invencible = invencible;
    }
}