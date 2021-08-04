package BEE;
import java.util.Random;
public class bee {
    static int health = 100;
  static float h;
    Random random = new Random();
    float health_reduction = random.nextInt(100);

    public void health() {
        System.out.println("intial health = " + health);
    }
    public void status() {
        System.out.println("intial status = " + "Alive");
    }
    public void damage() {
         h = health * (1 - (health_reduction / 100));
        System.out.println("damage = " + h);
    }
       public static void main(String[] args) {
        bee self = new bee();
        self.health();
        self.status();
        self.damage();
    }
}

