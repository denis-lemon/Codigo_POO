public class Jogador {
  private String nome;
  private int xp = 100;
  private int hp = 100;
  private boolean envenenado;
    
  public Jogador(String nome){
    this.nome = nome;
  }
    
  public int getXp(int xp){
    return xp;
  }
    
  public int getHp(int hp){
    return hp;
  }
    
  public void isEnvenenado(){
    if (envenenado == true){
      envenenado = false;
    }
    else{
      envenenado = true;
    }
    return isEnvenenado;
  }
  
  public getReceberDano(int pontos){
    hp--;
  }
  
  public getReceberDanoCura(int pontos){
    hp++;
  }
  
  public receberExperiencia (int pontos){
    if (envenenado == true){
      xp--;
    } else {
      xp++;
    }
  }
}