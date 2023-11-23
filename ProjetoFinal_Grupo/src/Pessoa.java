import java.util.Scanner;

public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected Sexo sexo;
    protected Endereco endereco;

    Endereco end = new Endereco();

    Scanner ler = new Scanner(System.in);

    public Pessoa() { }

    public Pessoa(String cpf, String nome, Sexo sexo, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        System.out.print("Informe o CPF: ");
        cpf = ler.nextLine();

        while (cpf.length() != 11) {
            System.out.println("\nCPF invalido!!! \n");
            System.out.print("Informe o CPF: ");
            cpf = ler.nextLine();
        }
        this.cpf = cpf;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.print("Informe o nome: ");
        nome = ler.nextLine().toUpperCase();
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        boolean saida;
        do {
            try{
                System.out.println("Qual é o sexo?");
                System.out.println("1 - Masculino");
                System.out.println("2 - Feminino");
                System.out.print("Digite 1 ou 2: ");
                byte opcSexo = ler.nextByte();
                switch (opcSexo) {
                    case 1:
                        sexo = Sexo.MASCULINO;
                        saida = true;
                        break;
                    case 2:
                        sexo = Sexo.FEMININO;
                        saida = true;
                        break;
                    default:
                        System.out.println("\n ...por favor, digite 1 ou 2! ...\n");
                        saida = false;
                        break;
                }
            }catch (Exception e){
                System.out.println("Digite o sexo, por favor!\n");

                saida = false;
                ler.next();
            }finally {
                this.sexo = sexo;
            }
        } while(!saida);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}