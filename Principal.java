public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ayeska",151142863,2);
        Endereco e1 = new Endereco("Rua Sebastiao Moreira da Silva","Jardim dos Estados",55);
        Endereco e2 = new Endereco("Rua Cassemiro de Abreu","Diniz",354);

        p1.addEndereco(e1);
        p1.addEndereco(e2);
        p1.mostraInfo();
    }
}
