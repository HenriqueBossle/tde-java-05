public class Main {
    public static void main(String[] args) {
        double preco = 10;

        Caixa c1 = new Caixa(new DescontoAniversario());
        System.out.println(preco - (preco * c1.calcularDesconto()));

        Caixa c2 = new Caixa(new DescontoNatal());
        System.out.println(preco - (preco * c2.calcularDesconto()));

        Caixa c3 = new Caixa(new DescontoBlackFriday());
        System.out.println(preco - (preco * c3.calcularDesconto()));
    }

}
