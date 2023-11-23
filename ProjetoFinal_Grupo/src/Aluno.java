import java.util.Scanner;

public class Aluno extends Pessoa {
    private byte ra;
    private Curso curso;

    Curso cur = new Curso();

    public Aluno() {
        super();
    }

    public Aluno(String CPF, String nome, Sexo sexo, Endereco endereco, byte ra, Curso curso) {
        super(CPF, nome, sexo, endereco);
        this.ra = ra;
        this.curso = curso;
    }

    public byte getRa() {
        return ra;
    }

    public void setRa(byte ra) {
        boolean saida;
        do {
            try {
                System.out.print("Digite o Registro Acadêmico do aluno(a): ");
                ra = ler.nextByte();
                saida = true;
            }catch (Exception e){
                System.out.println("Digite o ra!");
                saida = false;
                ler.next();
            }finally {
                this.ra = ra;
            }
        }while (!saida);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void cadastrarAluno(Scanner ler) {
        System.out.println("\n-- Cadastramento --");

        setCpf(cpf);
        setNome(nome);
        setSexo(sexo);
        setRa(ra);
        cur.setCurso();
        end.setEndereco();
    }

    public void dadosAluno() {
        System.out.println("\n Pessoa Fisica\n"
                + "-----------------"
                + "\n   CPF: " + getCpf()
                + "\n   nome: "	+ getNome()
                + "\n   sexo: " + getSexo()
                + "\n   RA: " + getRa()
                + "\n -------CURSO-------"
                + "\n   Nome: "+cur.getNome()
                + "\n Tipo: "+cur.getTipo()
                + "\n Carga Horaria: "+cur.getCh()
                + "\n Duração: "+cur.getDuracao()
                + "\n Mensalidade: "+cur.getMensalidade()
                + "\n ----------ENDEREÇO--------"
                + "\n Rua: "
                + end.getRua()+ "\n Numero: "
                + end.getNumero() +  "\n Bairro: "
                + end.getBairro() + "\n Cidade: "
                + end.getCidade() + "\n UF: "
                +end.getUF());

    }

}