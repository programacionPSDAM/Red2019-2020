package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTestHTTP {
    public static void main(String[] args) throws IOException {
        URL url = new URL(
                "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html");
        System.out.printf("Protocolo: %s%n", url.getProtocol());
        System.out.printf("Host: %s%n", url.getHost());
        System.out.printf("Path: %s%n", url.getPath());
        System.out.printf("Puerto: %d%n", url.getDefaultPort());

        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream));

        String linea;
        while ((linea = bufferedReader.readLine()) != null)
            System.out.println(linea);
    }
}
