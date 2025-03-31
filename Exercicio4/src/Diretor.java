public class Diretor extends Funcionario{
    public Diretor(double salario){
        super(salario);
    }

    @Override
    public double calculaSalario() {
        return salario + (salario * 0.60);
    }
}
