package PaqC01;

import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente a=new Cliente("Carlos","Sánchez","1234142D",2342356,78857,10,20);
        Cliente b=new Cliente("Lucas","Torres","112341422D",23422356,78834557,10,13);

        Hotel h=new Hotel();
        System.out.println(h);

        h.reservar(a,"estandar",6);
        h.reservar(a,"suite",6);
        h.reservar(a,"balcon",6);
        System.out.println(h);

        h.anularReserva(a,"estandar", 4);


        System.out.println("\n\n\n\n");
        Integer x=new Integer();
        h.otroMetodo(a,1,x);
        System.out.println("Has cancelado "+x.getX()+" habitaciones");
        System.out.println(h);



        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        fos = new FileOutputStream("HotelSerializar.dat");
        salida = new ObjectOutputStream(fos);
        salida.writeObject(h);
        fos.close();
        salida.close();
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        fis = new FileInputStream("HotelSerializar.dat");
        entrada = new ObjectInputStream(fis);

        System.out.println("\n\n");

        h= (Hotel) entrada.readObject();
        fis.close();
        entrada.close();
        System.out.println(h);

    }

}
