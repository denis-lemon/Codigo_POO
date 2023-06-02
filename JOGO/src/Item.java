public class Item extends Gameobject{
    private boolean visible;

    public Item(int x, int y) {
        super(x, y);
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
