package BEE;

public class Worker extends bee {


    public void damage() {
        h = health * (1 - health_reduction / 100);
        System.out.println("worker damage = " + h);

    if ( h >= 70) {

        System.out.println("w.damage" + h);
        System.out.println("status = " + "alive");
    }
        else{
            System.out.println(" w.status = " + "dead");
        }

    }


    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.health();
        worker.status();
        worker.damage();

    }
}


