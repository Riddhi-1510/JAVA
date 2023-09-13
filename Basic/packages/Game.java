package packages;

public class Game {
    public void player(int life,String name){
        System.out.println("Player Name is : " + name );
        System.out.println("Player life is : " + life + "%");
    }   
    public void enemy(int enemy){
        System.out.println("Total Enemy killed by player is : " + enemy);
    } 
    public void level(int l){
        System.out.println("Total Level Complated by Player : " + l);
    }
}

//  "Player," "Enemy," and "Level"