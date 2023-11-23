import java.util.Scanner;

public class Forma {
    private String titulo;
    private String nomeCurso;
    private int chCurso;
    Scanner ler = new Scanner(System.in);

    public Forma(){

    }
    public Forma(String titulo, String nomeCurso, int chCurso) {
        this.titulo = titulo;
        this.nomeCurso = nomeCurso;
        this.chCurso = chCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        System.out.print("Digite o titulo: ");
        titulo = ler.nextLine();
        this.titulo = titulo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        System.out.print("Digite o nome: ");
        nomeCurso = ler.nextLine();
        nomeCurso = ler.nextLine();
        this.nomeCurso = nomeCurso;
    }

    public int getChCurso() {
        return chCurso;
    }

    public void setChCurso(int chCurso) {
        boolean saida;
        do {
            try {
                System.out.print("Digite a carga horaria: ");
                chCurso = ler.nextInt();
                saida = true;
            }catch (Exception e){
                System.out.println("Digite a carga horaria do curso");
                saida = false;
                ler.next();
            }finally {
                this.chCurso = chCurso;
            }
        }while (!saida);
    }

    public void setForma() {
        setChCurso(chCurso);
        setNomeCurso(nomeCurso);
        setTitulo(titulo);
    }
}
