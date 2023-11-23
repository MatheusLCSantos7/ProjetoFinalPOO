public interface Mensalidade {


    // Valores ficticios

    final float tecnologo = 600.90F; // mensalidade do tecnologo
    final float bacharelado = 750.50F; // mensalidade do bac
    final float licenciatura = 850.80F; // mensalidade da licenciatura

    final int chTenologo = 2000;
    final int chBacharelado = 3000;
    final int chLicenciatura = 3400;

    public abstract double CalculoMensalidade (int codigo);

}