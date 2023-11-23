
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluno a = new Aluno();
        Professor p = new Professor();

        byte opc;
        do {
            try {
                System.out.println("\n..: Menu Principal :..");
                System.out.println("----------------------");
                System.out.println("1 - Cadastrar aluno");
                System.out.println("2 - Cadastrar professor");
                System.out.println("3 - Mostrar os dados do aluno");
                System.out.println("4 - Mostrar os dados do professor");
                System.out.println("5 - Sair do sistema ");
                System.out.print("Digite uma opção: ");
                opc = ler.nextByte();

                switch (opc) {
                    case 1:
                        a.cadastrarAluno(ler);
                        break;
                    case 2:
                        p.cadastrarProfessor(ler);
                        break;
                    case 3:
                        System.out.println("\n Mostrando os dados do Aluno:");
                        a.dadosAluno();
                        break;
                    case 4:
                        System.out.println("\n Mostrando os dados do Professor:");
                        p.dadosProfessor();
                        break;
                    case 5:
                        System.out.println("Saindo do sistema......");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            }catch (Exception e){
                System.out.println("Opção invalida");

                opc = 5;
                ler.next();
            }
        } while (opc != 5);
        ler.close();
    }
}