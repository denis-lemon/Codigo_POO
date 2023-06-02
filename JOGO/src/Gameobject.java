public class Gameobject {
    private int x = 100;
    private int y = 100;
    private int screenSize;

    public Gameobject() {}
    public Gameobject(int x, int y) {
        if(x<0 || y < 0)
            throw new RuntimeException("Parâmetros inválidos!!");
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}