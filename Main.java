
class Main{

        public static void main(String[] args){
            
            Evento silencio = new  Evento();

            silencio.setId(14);
            silencio.setNome("silencio");
            silencio.setOcorrencia(16, 9, 2019);
            
            System.out.printf("%s%n", silencio);

        }
}