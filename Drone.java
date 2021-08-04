package BEE;

public class Drone extends bee {
    public void damage() {
        h = health * (1 - health_reduction / 100);
        System.out.println("drone damage = " + h);
        if ( h >= 50) {
            System.out.println("d.damage" + h);
            System.out.println("status = " + "alive");
        }
        else{
            System.out.println(" d.status = " + "dead");
        }
    }

    public static void main(String[] args) {
        Drone drone = new Drone();
        drone.health();
        drone.status();
        drone.damage();

    }
}


