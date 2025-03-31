
public class Relatorio {
    private IFonteDeDados fonteDeDados;

    public Relatorio(IFonteDeDados fonteDeDados) {
        this.fonteDeDados = fonteDeDados;
    }
    public void gerarRelatorio() {
        String dados = fonteDeDados.fonteDados();
        System.out.println("Gerendo relatorio com: "+ dados);
    }


}
