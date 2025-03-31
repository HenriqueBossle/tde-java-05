public class Gerente extends Funcionario{

    public Gerente(double salario){
        super(salario);
    }
    @Override
    public double calculaSalario() {
        return salario + (salario * 0.20);
    }
}
