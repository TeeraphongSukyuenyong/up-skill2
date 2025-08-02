public class TestTimeModern {
    public static void main(String[]args){
        TimeModern t =new TimeModern(23,59,59);
        System.out.println("Start time; "+t);
        TimeModern t2 = t.nextSecond();
        System.out.println("After 1 second"+t2);
        TimeModern t3 = t2.nextSecond().nextSecond();

        System.out.println("Hour:"+t3.getHour());
        System.out.println("Minute:"+t3.getMinute());
        System.out.println("Second:"+t3.getSecond());

        TimeModern t4 = t.withTime(7, 7, 7);
        System.out.println("New time with withtime():"+t4);
    }
}
