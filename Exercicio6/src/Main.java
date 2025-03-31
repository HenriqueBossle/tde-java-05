public class Main {
    public static void main(String[] args) {
        IFonteDeDados bd1 = new BancoDeDados();
        Relatorio relatorio1 = new Relatorio(bd1);
        relatorio1.gerarRelatorio();
    }
}
