package ExceptionHandling.Checked;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MalformedURLExceptionDemo {
    public static void main(String[] args) {
        String link="https://www.google.com/img.hp";
        try {
            URL url=new URL(link);
            System.out.println(url.getHost());
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}
