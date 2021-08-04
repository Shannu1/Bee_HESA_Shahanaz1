package BEE;

public class Queen extends bee {

    public void damage() {
        h = health * (1 - health_reduction / 100);
        System.out.println("queen damage = " + h);

        if ( h >= 20) {

            System.out.println("q.damage" + h);
            System.out.println("status = " + "alive");
        }
        else{
            System.out.println(" q.status = " + "dead");
        }

    }


    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.health();
        queen.status();
        queen.damage();

    }
}


