public class Main {
    public static void main(String[] args) {
       double salario = 2500;
       Desenvolvedor dev = new Desenvolvedor(salario);
       System.out.println(dev.calculaSalario());
       Gerente gerente = new Gerente(salario);
       System.out.println(gerente.calculaSalario());
       Diretor diretor = new Diretor(salario);
       System.out.println(diretor.calculaSalario());
    }
}
