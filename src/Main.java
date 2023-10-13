
public class Main {
    public static void main(String[] args) {
        Phone iPhone13 = new Phone();

        System.out.println("<--Running App-->");
        iPhone13.setPhoneCall();
        iPhone13.setPhoneCall();
        iPhone13.setPhoneCall();
        iPhone13.setPlayGame();
        iPhone13.setPlayGame();
        iPhone13.setChargePhone();
        System.out.println(iPhone13.getBattery() + "%");
    }
}