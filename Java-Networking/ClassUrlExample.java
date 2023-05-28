import java.net.*;

public class ClassUrlExample {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        /*
         * CLASE URL
         * La clase URL en Java es el punto de entrada a cualquier fuente disponible en
         * Internet. Una URL de clase describe un localizador uniforme de recursos, que
         * es una señal de un "recurso" en la World Wide Web. Una fuente puede denotar
         * un archivo o directorio simple, o puede indicar un objeto más difícil, como
         * una consulta a una base de datos o un motor de búsqueda. URL es una cadena de
         * texto que reconoce todas las fuentes en Internet, mostrándonos la dirección
         * de la fuente, cómo interactuar con ella y recuperar algo de ella.
         */
        URL url = new URL("https://write.geeksforgeeks.org/post/3038131");

        // to get and print the protocol of the URL
        String protocol = url.getProtocol();

        System.out.println("Protocol : " + protocol);

        // to get and print the hostName of the URL
        String host = url.getHost();

        System.out.println("HostName : " + host);

        // to get and print the file name of the URL
        String fileName = url.getFile();

        System.out.println("File Name : " + fileName);

        /*
         * INET ADRESS
         * La clase InetAddress se usa para proporcionar métodos para obtener la
         * dirección IP de cualquier nombre de host. Una dirección IP se expresa
         * mediante un número sin signo de 32 o 128 bits. Un objeto de InetAddress
         * describe la dirección IP con su nombre de host análogo. InetAddress puede
         * controlar direcciones IPv4 e IPv6.
         * 
         * Hay dos tipos diferentes de direcciones:
         * 
         * Unicast: es un identificador para una sola interfaz.
         * Multicast: es un identificador para una colección de interfaces.
         */
        // To get and print InetAddress of Named Hosts
        InetAddress address1 = InetAddress.getByName("write.geeksforgeeks.org");

        System.out.println("Inet Address of named hosts : " + address1);

        // To get and print ALL InetAddress of Named Host
        InetAddress arr[] = InetAddress.getAllByName("www.geeksforgeeks.org");

        System.out.println("\nInet Address of ALL named hosts :");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
