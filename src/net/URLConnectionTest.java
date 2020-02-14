package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionTest {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {

           // URL url = new URL(
           //         "ftp://cisco/linux/otros/win7/readme.txt");
            URL url = new URL("https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URLConnection.html");
            URLConnection urlConnection = url.openConnection();
            Map<String, List<String>> cabeceras = urlConnection.getHeaderFields();
            Set<String> nombreCabeceras = cabeceras.keySet();

            nombreCabeceras.forEach(
                    c -> System.out.println(c + ": " + cabeceras.get(c)));
           in = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String linea;
            while ((linea = in.readLine()) != null)
                System.out.println(linea);
        } catch (MalformedURLException e) {
            System.out.println("URL no válida");
        } catch (IOException e) {
            System.out.println("Error I/O 1");
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                System.out.println("Error I/O 2");
            }
        }

    }
}
