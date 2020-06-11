package trabalhandoComDatas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exemplo03DateFormat {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 15/07/19 22:13

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22:13


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22h13min55s BRT

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 14/07/2019

        //Converter a Data atual para o formato DD/MM/YYYY HH:MM:SS:MMMM
        // SimpleDateFormat formatador = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:MMM");
        // retorna 163/06/2020 19:06:239:jun
        //link for reference - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS z");
        String formatExercicio =  formatador.format(agora);
        System.out.println(formatExercicio);


    }
}
