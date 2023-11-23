import java.util.Scanner;

public class Curso implements Mensalidade{
    private NomeCurso nome;
    private int tipo;
    private int ch;
    private float duracao;
    private double mensalidade;
    Scanner ler = new Scanner(System.in);

    public Curso(){

    }
    public Curso(NomeCurso nome, int tipo, int ch, float duracao, float mensalidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.ch = ch;
        this.duracao = duracao;
        this.mensalidade = mensalidade;
    }

    public NomeCurso getNome() {
        return nome;
    }

    public void setNome(NomeCurso nomeCurso) {
        boolean saida;
        do {
            try {
                System.out.println("Qual é nome do curso?");
                System.out.println("1 - Ads");
                System.out.println("2 - Ciencia da Computacao");
                System.out.println("3 - Sistema de Informacao");

                System.out.print("Digite 1,2 ou 3: ");
                byte opcSexo = ler.nextByte();
                switch (opcSexo) {
                    case 1:
                        nomeCurso = NomeCurso.ADS;
                        saida = false;
                        break;
                    case 2:
                        nomeCurso = NomeCurso.C_COMPUTAÇÃO;
                        saida = false;
                        break;
                    case 3:
                        nomeCurso = NomeCurso.SIS_INFO;
                        saida = false;
                        break;
                    default:
                        System.out.println("\n ...por favor, digite 1,2 ou 3! ...\n");
                        saida = true;
                        break;
                }
            }catch (Exception e){
                System.out.println("Digite 1, 2 ou 3!");
                saida = true;
                ler.next();
            }finally {
                nome = nomeCurso;
            }
        } while(saida);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        do {
            try {
                System.out.print("Digite o tipo do curso: ");
                System.out.println("1 - tecnologo");
                System.out.println("2 - bacharelado");
                System.out.println("3 - licenciatura");
                tipo = ler.nextInt();
            }catch (Exception e){
                System.out.println("Digite uma opção valida");
                ler.next();
            } finally {
                this.tipo = tipo;
            }
        }while (tipo > 3 || tipo < 1);
    }

    public int getCh() {
        return ch;
    }

    public int setCh(int Curso) {
        if(Curso == 1){
            ch = chTenologo;
        } else if(Curso == 2){
            ch = chBacharelado;
        } else if(Curso == 3){
            ch = chLicenciatura;
        }else {
            System.out.println("Opção Inexistente");
        }
        return ch;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        boolean saida;
        do {
            try {
                System.out.print("Digite a duracao do curso: ");
                duracao = ler.nextFloat();
                saida = true;
            }catch (Exception e){
                System.out.println("Digite a duracao!");
                saida = false;
                ler.next();
            }finally {
                this.duracao = duracao;
            }
        }while (!saida);
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        boolean saida;
        do {
            try {
                System.out.print("Digite a mensalidade do curso: ");
                mensalidade = ler.nextFloat();
                saida = false;
            }catch (Exception e){
                System.out.println("Digite a mensalidade!");
                saida = true;
                ler.next();
            }finally {
                this.mensalidade = mensalidade;
            }
        }while (!saida);
    }

    public void setCurso(){
        setNome(nome);
        setTipo(tipo);
        setCh(tipo);
        setDuracao(duracao);
        CalculoMensalidade(tipo);
    }

    @Override
    public double CalculoMensalidade(int Curso) {
        if(Curso == 1){
            mensalidade = tecnologo;
        } else if(Curso == 2){
            mensalidade = bacharelado;
        } else if(Curso == 3){
            mensalidade = licenciatura;
        }else {
            System.out.println("Opção Inexistente");
        }
        return mensalidade;
    }
}
