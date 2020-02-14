package net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTestFTP {
    public static void main(String[] args) throws IOException {
        URL url = new URL(
                "ftp://cisco/linux/otros/win7/readme.txt");
        System.out.printf("Protocolo: %s%n", url.getProtocol());
        System.out.printf("Host: %s%n", url.getHost());
        System.out.printf("Path: %s%n", url.getPath());
        System.out.printf("Puerto: %d%n", url.getDefaultPort());

        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream));
        PrintWriter printWriter = new PrintWriter(new File("ficheros/salida.txt"));
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            printWriter.println(linea);
            printWriter.flush();
        }
        bufferedReader.close();
        printWriter.close();
        System.out.println("Fin de programa");
    }
}
