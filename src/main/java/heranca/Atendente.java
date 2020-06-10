package heranca;

public class Atendente extends Funcionario{

    public double calcularImposto(){
        return this.getSalario()*0.01;
    }
}
