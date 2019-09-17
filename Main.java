import java.util.Scanner;
class Main{

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            Evento silencio = new  Evento();

            silencio.setId(in.nextInt());
            silencio.setNome(in.next());
            silencio.setOcorrencia(in.nextInt(), in.nextInt(), in.nextInt());
            
            System.out.printf("%s%n", silencio);
            in.close();
        }
}