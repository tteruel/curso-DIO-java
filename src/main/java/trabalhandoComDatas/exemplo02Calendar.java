package trabalhandoComDatas;
import java.util.Calendar;

public class exemplo02Calendar {


    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);


        System.out.println("A data corrente é : " + agora.getTime());
        // A data corrente é : Sun Jul 14 20:50:31 BRT 2019

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Sat Jun 29 20:50:31 BRT 2019

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Tue Oct 29 20:50:31 BRT 2019

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Fri Oct 29 20:50:31 BRT 2021



        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2019

        System.out.printf("%tF\n", agora);
        //2019-07-14

        System.out.printf("%tD\n", agora);
        //07/14/19

        System.out.printf("%tr\n", agora);
        //08:58:11 PM

        System.out.printf("%tT\n", agora);
        //20:58:11


        /* Um cliente tem 10 dias para pagar uma fatura após a data de vencimento sem que os juros sejam cobrados.
        caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.
        crie uma estrutura que receba  uma data de vencimento e calcule quantos dias ele tem para pagar
         */


        System.out.println("Um cliente tem 10 dias para pagar uma fatura após a data de vencimento sem que os juros sejam cobrados.\n" +
                "caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte.\n" +
                "crie uma estrutura que receba  uma data de vencimento e calcule quantos dias ele tem para pagar");

        Calendar dataFatura = Calendar.getInstance();

        dataFatura.set(Calendar.YEAR, 2020);
        dataFatura.set(Calendar.MONTH, Calendar.JULY);
        dataFatura.set(Calendar.DAY_OF_MONTH, 22);

        System.out.println("A data de vencimento da fatura é: "+ dataFatura.getTime());
        dataFatura.add(Calendar.DATE, 10);

        if(dataFatura.getTime().getDay() == 6){
            dataFatura.add(Calendar.DATE, 2);
        }
        if(dataFatura.getTime().getDay() == 7){
            dataFatura.add(Calendar.DATE, 1);
        }

        System.out.println("Sem Juros até: " + dataFatura.getTime());

    }

}
