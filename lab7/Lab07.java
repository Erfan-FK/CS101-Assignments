package lab7;

public class Lab07 {
    public static void main(String[] args) {

        Track t1 = new Track("Love over gold", 123, 234, "12/08/1982", (short)2473);
        t1.setGenre("RO");

        Track t2 = new Track("Gozleri aska gulen", 0, 98, "18/04/2018", (short)257);
        t2.setGenre("PO");

        Track t3 = new Track("Down to the waterline", 123, 234, "09/06/1978", (short)235);

        System.out.println("Is t1 before t2? " + t1.isBefore(t2));
        System.out.println("Is t2 before t3? " + t2.isBefore(t3));
        
        t1.play();
        t3.play();
        t3.play();
        t1.playBatch(100);
        t3.playBatch(10);
        t1.play();
        t2.playBatch(50);
        t1.unregister();
        t1.play();
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());

    }
}
