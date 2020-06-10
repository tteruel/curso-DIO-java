package trabalhandoComDatas;
import java.util.Date;


public class exemplo01Date {
    public static void main(String[] args) {

        //Exemplo 01
        System.out.println("Exemplo 01 -----");
        Date novaData = new Date();
        System.out.println(novaData);

        //Exemplo 02
        System.out.println("Exemplo 02 ----- System.currentTimeMillis");
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Date novaDataCM = new Date(currentTimeMillis);
        // 1563127311564
        System.out.println(novaDataCM);


        //Exemplo 03
        System.out.println("Exemplo 03 ----- after e before");
        Date dataNoPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021

        /* Comparando se a dataNoPassado é posterior a dataNoFuturo */
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        System.out.println(isAfter);
        //false
        /* Comparando se a dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true


        //Exemplo 04
        System.out.println("Exemplo 03 ----- after e before");
        Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se as datas são iguais */
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println(compareCase1); // -1

        System.out.println(compareCase2); // 1

        System.out.println(compareCase3); // 0

        //Exemplo 05
        System.out.println("Exemplo 05 ----- after e before");


        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // Tue Dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        // 2017-12-13T00:26:47.691Z

        //Exercicio
        /* Encontrar o timeMillis do dia em que nasci
        * converter para um objeto Date
        * Verifica se é anterior ou posterior a 15 de maio de 2010*/

    }
}
