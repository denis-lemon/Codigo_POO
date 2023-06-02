public abstract class PlayerGen  extends Gameobject{

    public static final int CIMA = 0;
    public static final int DIREITA = 90;
    public static final int BAIXO = 180;
    public static final int ESQUERDA = 270;

    private int direction;

    public PlayerGen(){}

    public PlayerGen(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean canMove(){
        int newX= getX();
        int newY = getY();
        
        if(direction == CIMA) newY -= 10;
        if(direction == DIREITA) newY += 10;
        if(direction == BAIXO) newY += 10;
        if(direction == ESQUERDA) newY -= 10;

        //Object Calestenic
        return (
            newX >= 0 && 
            newX < getScreenSize() &&
            newY >= 0 && 
            newY < getScreenSize()
        );
    }

    public void move(){
        if(canMove()){
            if(direction == CIMA) setY(getY() -10);
            if(direction == DIREITA) setX(getX() +10);
            if(direction == BAIXO) setY(getY() +10);
            if(direction == ESQUERDA) setX(getX() -10);
        }
    }
}
