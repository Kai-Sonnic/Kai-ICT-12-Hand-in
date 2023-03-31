public class Main {
    public static void main(String[] args) {
        Time time = new Time(0,0,0);
        System.out.println(time.getHour());
        time.setSecond(93);
        System.out.println(time.toString());
        System.out.println(time.nextSecond());
        System.out.println(time.toString());
        System.out.println(time.previousSecond());
        System.out.println(time.previousSecond());

    }
}
