package TSP;


import com.sun.corba.se.pept.transport.Acceptor;
import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Tspserver implements Runnable {

    ServerSocket ssoc = null;
    ArrayList<Socket> clsoc = new ArrayList<Socket>();
    ArrayList<Socket> ansoc=new ArrayList<Socket>();
    Hashtable<String, Socket> ht=new Hashtable<String, Socket>();
     Hashtable<String, Socket> ht1=new Hashtable<String, Socket>();
int jobid=0;
    public Tspserver() {
        try {
            ssoc = new ServerSocket(8888);
            System.out.println("TSP server Started");
            new Thread(this).start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void run() {
        while (true) {
            try {

                Socket soc = ssoc.accept();
                new Child(soc).start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

    class Child extends Thread {

        Socket soc = null;

        private Child(Socket so) {

            soc = so;
        }

        public void run() {
            try {

                InputStream im = soc.getInputStream();
                OutputStream out = soc.getOutputStream();
                DataInputStream din = new DataInputStream(im);
                PrintStream ps = new PrintStream(out);
                String reqfrom = din.readLine();
                if (reqfrom.equals("bank")) {
                  ht1.put(reqfrom, soc);
                    System.out.println("server socket"+soc);

                }
                while (true) {
                    String s = din.readLine();

                    System.out.println("1st string" + s);
                   if(s==null)
                   {
                       break;
                   }
                    if(s.equals("exit"))
                    {
                        break;
                        
                    }
                    if (s.equals("register")) {
                       jobid+=1;
                     ht.put(jobid+"",soc);

                        String uname = din.readLine();
                        System.out.println(uname);
                        String web=din.readLine();
                        System.out.println(web);
                        String mob=din.readLine();
                        System.out.println(mob);
                        String msg=uname+"/"+mob;
                        Socket soc1=ht1.get(web);
                        if(soc1!=null)
                        {
                        send(msg,soc1);
                        }
                        else
                        {
                            errorReply(soc);

                        }
                    }
                    if (s.equals("recovery")) {
                       jobid+=1;
                     ht.put(jobid+"",soc);

                        String uname = din.readLine();
                        System.out.println(uname);
                        String web=din.readLine();
                        System.out.println(web);
                        String mob=din.readLine();
                        System.out.println(mob);
                        String msg=uname+"/"+mob;
                        Socket soc1=ht1.get(web);
                        if(soc1!=null)
                        {
                        send1(msg,soc1);
                        }
                        else
                        {
                            errorReply(soc);

                        }
                    }

                    if (s.equals("registerreply")) {

                        String random = din.readLine();
                        System.out.println("random" + random);
                        String webmob = din.readLine();
                        System.out.println("mob" + webmob);
                        sendReply(random,webmob);

                    }
                    if (s.equals("recoveryreply")) {

                        String random = din.readLine();
                        System.out.println("random" + random);
                        String webmob = din.readLine();
                        System.out.println("mob" + webmob);
                        sendReply(random,webmob);

                    }
                }
            } catch (Exception e) {
            }

        }

        private void send(String msg, Socket soc) throws IOException {

            
            System.out.println(soc);
            OutputStream out = soc.getOutputStream();
            PrintStream ps = new PrintStream(out);
            ps.println("register");
            ps.println(msg);



        }



        private void sendReply(String random, String webmob) throws IOException {
             Socket soc = ht.get(jobid+"");
             System.out.println(soc);
            OutputStream out = soc.getOutputStream();
            PrintStream ps = new PrintStream(out);
            ps.println(random);
            ps.println(webmob);
        }

        private void errorReply(Socket soc) throws IOException {
            OutputStream out=soc.getOutputStream();
            PrintStream ps=new PrintStream(out);
            ps.println("invalid webid");
        }

        private void send1(String msg, Socket soc1) throws IOException {
       System.out.println("server socket"+soc1);
            System.out.println(soc1);
            OutputStream out = soc1.getOutputStream();
            PrintStream ps = new PrintStream(out);
            ps.println("recovery");
            ps.println(msg);

        }
    }

    public static void main(String[] args) {
        new Tspserver();
    }
}
