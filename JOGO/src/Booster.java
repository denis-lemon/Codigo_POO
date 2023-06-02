public class Booster extends Item {
    private int duration;

    public Booster(int x, int y, int duration) {
        super(x, y);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
