package structural.proxy;

public class main {
    static void main(String[] args) {
        Internet internet = new RealInternet();
        internet.connect("www.google.com");

    }
}
