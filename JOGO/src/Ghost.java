public class Ghost extends PlayerGen{

    public Ghost(int x, int y, int direction) {
        super(x, y, direction);
    }

    @Override
    public void move() {
        var sorteioDirection = Math.random();
        if (sorteioDirection < .6){
            var sorteio = Math.random();  //0 -> 1
            if (sorteio < .25) this.setDirection(DIREITA);
            if (sorteio > .25  && sorteio < .5) this.setDirection(CIMA);
            if (sorteio > .5 && sorteio < .75) this.setDirection(BAIXO);
            if (sorteio > .75) this.setDirection(ESQUERDA);
        }
        super.move();
    }
}
