import java.util.Scanner;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private Cidade cidade;
    private String UF;
    Scanner ler = new Scanner(System.in);

    public Endereco() {

    }

    public Endereco(String rua, int numero, String bairro, Cidade cidade, String UF) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        System.out.println("Escreva rua: ");
        rua = ler.nextLine();
        this.rua = rua.toUpperCase();
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        boolean saida;
        do {
            try {
                System.out.println("Escreva Numero: ");
                numero = ler.nextInt();
                saida = true;
            }catch (Exception e){
                System.out.println("Digite um numero");
                saida = false;
                ler.next();
            }finally {
                this.numero = numero;
            }
        }while (!saida);
    }


    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        System.out.println("Escreva bairro: ");
        bairro = ler.nextLine();
        this.bairro = bairro.toUpperCase();
    }


    public Cidade getCidade() {
        return cidade;
    }


    public void setCidade(Cidade cidade) {
        boolean saida;
        do {
            System.out.println("Qual é a cidade?");
            System.out.println("1 - Belo Horizonte \t 5 - Nova Lima ");
            System.out.println("2 - Contagem 	   \t 6 - Betim ");
            System.out.println("3 - Sabará 	   \t 7 - Caeté ");
            System.out.println("4 - Neves 	   \t 8 - Santa Luzia ");
            System.out.print("Digite 1, 2, 3, 4, 5, 6, 7 ou 8: ");
            byte opcSexo = ler.nextByte();
            switch (opcSexo) {
                case 1:
                    cidade = Cidade.Belo_Horizonte;
                    saida = false;
                    break;
                case 2:
                    cidade = Cidade.Contagem;
                    saida = false;
                    break;
                case 3:
                    cidade = Cidade.Sabará;
                    saida = false;
                    break;
                case 4:
                    cidade = Cidade.Neves;
                    saida = false;
                    break;
                case 5:
                    cidade = Cidade.Nova_Lima;
                    saida = false;
                    break;
                case 6:
                    cidade = Cidade.Betim;
                    saida = false;
                    break;
                case 7:
                    cidade = Cidade.Caeté;
                    saida = false;
                    break;
                case 8:
                    cidade = Cidade.Santa_Luzia;
                    saida = false;
                    break;
                default:
                    System.out.println("\n ...por favor, digite 1, 2, 3, 4, 5, 6, 7, ou 8! ...\n");
                    saida = true;
                    break;
            }
        } while(saida);

        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        System.out.println("Escreva UF: ");
        UF = ler.nextLine();
        UF = ler.nextLine();
        this.UF = UF.toUpperCase();
    }

    public void setEndereco(){
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setNumero(numero);
        setUF(UF);
    }
}