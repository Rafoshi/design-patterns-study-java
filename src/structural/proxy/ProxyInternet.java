package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private static List<String> blockList;

    static {
        blockList = new ArrayList<>();
        blockList.add("www.youtube.com");
    }

    @Override
    public void connect(String host) {
        if(blockList.contains(host)) {
            System.out.println("Blocked website.");
            return;
        }

        Internet internet = new RealInternet();
        internet.connect(host);
    }
}
