public class Pessoa extends Animal  {
    // Atributos da pessoa
    public String sobrenome;
    // Métodos da classe
    public void falar() {
        System.out.println("falei");
       }
       // sobrecarga do método falar()
    public String falar(String volume) {
        return "falei" + volume;
    }
        public void comer() {
            System.out.println("comeu como pessoa");
        }

    }
