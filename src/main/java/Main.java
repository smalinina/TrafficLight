public class Main {

    public static void main(String[] args) throws InterruptedException {
        TrafficLight tr = new TrafficLight();
        int red = tr.getTime(Colour.RED);
        int yellow = tr.getTime(Colour.YELLOW);
        int green = tr.getTime(Colour.GREEN);
        int count = 5;

        while (count > 0) {
            tr.start(red, Colour.RED);
            tr.start(yellow, Colour.YELLOW);
            tr.start(green, Colour.GREEN);
            count--;
        }

    }

}
