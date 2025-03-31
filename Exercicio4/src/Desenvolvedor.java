public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(double salario){
        super(salario);
    }

    @Override
    public double calculaSalario() {
        return salario + (salario * 0.10);
    }

}
