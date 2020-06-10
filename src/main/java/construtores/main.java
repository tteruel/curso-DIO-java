package construtores;
class instanciaCarro {
    public static void main(String[] args) {
        Carro carroA = new Carro("Ferrari", "F50", 2010);

        Carro carroB = new Carro("BMW", "W100", 2019);

        System.out.println("-----Carro 1-----");
        System.out.println(carroA.getMarca());
        System.out.println(carroA.getModelo());
        System.out.println(carroA.getAno());


        System.out.println("-----Carro 2-----");
        System.out.println(carroB.getMarca());
        System.out.println(carroB.getModelo());
        System.out.println(carroB.getAno());
    }
}

