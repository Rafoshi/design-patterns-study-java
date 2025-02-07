package structural.proxy;

public class main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connect("www.google.com");
        internet.connect("www.youtube.com");
    }
}
