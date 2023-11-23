import java.util.Scanner;

public class Professor extends Pessoa implements Impostos {
    private Forma formacao;
    private int chProf;
    private float salario;
    protected double salarioIR;

    Forma forma = new Forma();

    public Professor() {
        super();
    }

    public Professor(String cpf, String nome, Sexo sexo, Endereco endereco, Forma formacao, int chProf, float salario) {
        super(cpf, nome, sexo, endereco);
        this.chProf = chProf;
        this.formacao = formacao;
        this.salario = salario;
    }

    public Forma getFormacao() {
        return formacao;
    }

    public void setFormacao(Forma formacao) {
        this.formacao = forma;
    }

    public int getChProf() {
        return chProf;
    }

    public void setChProf(int chProf) {
        this.chProf = chProf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        boolean saida;
        do{
            try {
                System.out.println("Digite o seu salario");
                salario = ler.nextFloat();
                saida = true;
            }catch (Exception e){
                System.out.println("Digite o salario");
                saida = false;
                ler.next();
            }finally {
                this.salario = salario;
            }
        }while (!saida);
    }

    public void cadastrarProfessor(Scanner ler) {
        System.out.println("\n-- Cadastramento --");

        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        forma.setForma();
        end.setEndereco();
        setSalario(salario);
        IR(salario);
    }

    @Override
    public double IR(double salario){
        if(salario <= 1903.98){
            salario-= faixa1;
        } else if(salario> 1903.98 && salario <= 2826.65){
            salario -= faixa2;
        } else if(salario > 2826.66 && salario <= 3751.05){
            salario -= faixa3;
        } else if(salario > 3751.06 && salario <= 4664.68){
            salario -= faixa4;
        } else {
            salario -= faixa5;
        }

        salarioIR = salario;
        return salarioIR;
    }

    public double getSalarioIR(){
        return salarioIR;
    }

    public void dadosProfessor()  {
        System.out.println("\n Pessoa Fisica\n" + "-----------------"
                + "\n   CPF: " + getCpf()
                + "\n   nome: "
                + getNome() + "\n   sexo: "
                + getSexo()
                + "\n ----------ENDEREÇO--------"
                + "\n Rua: "
                + end.getRua()+ "\n Numero: "
                + end.getNumero() +  "\n Bairro: "
                + end.getBairro() + "\n Cidade: "
                + end.getCidade() + "\n UF: "
                + end.getUF()
                + "\n -------FORMAÇÃO-------"
                + "\n Titulo: "+forma.getNomeCurso()
                + "\n Nome: "+forma.getNomeCurso()
                + "\n Carga Horaria: "+forma.getChCurso()
                + "\n Salario: "+getSalario()
                + "\n Salario com IR: "+getSalarioIR()
        );
    }
}