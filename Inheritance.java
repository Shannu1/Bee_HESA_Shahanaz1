package BEE;

public class Inheritance extends bee {
    static int i;

    //static ArrayList<Inheritance>  InheritanceList = new ArrayList<Inheritance>(10);
    public static void main(String[] args) {


        bee self = new bee();

        for (i = 0; i < 10; i++) {
            Drone drone = new Drone();
            Queen queen = new Queen();
            Worker worker = new Worker();

            self.health();
            self.status();
            self.damage();
            drone.damage();
            queen.damage();
            worker.damage();
        }
    }
}








