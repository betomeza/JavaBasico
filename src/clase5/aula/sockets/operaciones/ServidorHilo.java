package clase5.aula.sockets.operaciones;

import clase5.aula.sockets.servidores.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorHilo {

    private int port;

    public ServidorHilo(int port) {
        this.port = port;
    }

    public static void main(String[] args) {
        ServidorHilo play = new ServidorHilo(9999);
        play.ejecutar();
    }
    
    public void ejecutar() {

        try {
            // Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);

            System.out.println("Servidor iniciado...");

            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();

                OperacionesHilo ts = new OperacionesHilo(cliente);
                ts.start();

            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
