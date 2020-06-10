package heranca;

public class ExemploHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Carlos");
        gerente.setCargo("Gerente");
        gerente.setSalario(2000);

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Robson");
        supervisor.setCargo("Supervisor");
        supervisor.setSalario(2000);

        Atendente atendente = new Atendente();
        atendente.setNome("Zézinho");
        atendente.setCargo("Atendente");
        atendente.setSalario(2000);

        System.out.println("---------------------------------");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Cargo: " + gerente.getCargo());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Imposto: R$" + gerente.calcularImposto());

        System.out.println("---------------------------------");
        System.out.println("Nome: " + supervisor.getNome());
        System.out.println("Cargo: " + supervisor.getCargo());
        System.out.println("Salário: R$" + supervisor.getSalario());
        System.out.println("Imposto: R$" + supervisor.calcularImposto());

        System.out.println("---------------------------------");
        System.out.println("Nome: " + atendente.getNome());
        System.out.println("Cargo: " + atendente.getCargo());
        System.out.println("Salário: R$" + atendente.getSalario());
        System.out.println("Imposto: R$" + atendente.calcularImposto());
    }
}
