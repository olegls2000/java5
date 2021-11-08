import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.OutputStream;

public class Server {

    public static void main(String[] args) throws Throwable {
        ServerSocket ss = new ServerSocket(80);
        while (true) {
            Socket s = ss.accept();

            System.err.println("Сервер принял подключение");
            new Thread(new SocketProcessor(s)).start();
        }
    }

    private static class SocketProcessor implements Runnable {

        private Socket sock;
        private InputStream istr;
        private OutputStream ostr;

        private SocketProcessor(Socket s) throws Throwable {
            this.sock = s;
            this.istr = s.getInputStream();
            this.ostr = s.getOutputStream();
        }

        public void run() {
            try {
                readInputHeaders();
                writeResponse("<html><body><h1><center>Hello my friend!<br><br><b>My phone number +37258176187</b></center></h1></body></html>" + sock);
            } catch (Throwable t) {
            } finally {
                try {
                    sock.close();
                } catch (Throwable t) {
                }
            }
            System.err.println("Сервер обработал клиента и завершил процесс " + sock);
        }

        private void writeResponse(String s) throws Throwable {
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Server: YarServer/2021-11-06\r\n" +
                    "Content-Type: text/html\r\n" +
                    "Content-Length: " + s.length() + "\r\n" +
                    "Connection: close\r\n\r\n";
            String result = response + s;
            ostr.write(result.getBytes());
            ostr.flush();
        }

        private void readInputHeaders() throws Throwable {
            BufferedReader br = new BufferedReader(new InputStreamReader(istr));
            while (true) {
                String s = br.readLine();
                if (s == null || s.trim().length() == 0) {
                    break;
                }
            }
        }
    }
}
