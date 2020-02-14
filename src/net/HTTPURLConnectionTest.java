package net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnectionTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://as.com");
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        System.out.printf("Código de conexión: %d%n ", conexion.getResponseCode());
    }
}
