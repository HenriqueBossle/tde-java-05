public class Caixa{

    private Desconto desconto;
    public Caixa(Desconto desconto){
         this.desconto = desconto;
    }

    public double calcularDesconto() {
        return this.desconto.calcular();
    }
}
