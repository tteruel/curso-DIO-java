package trabalhandoComDatas;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class exemplo04LocalDate {
    public static void main(String[] args) {


    LocalDate hoje = LocalDate.now();
    System.out.println(hoje);
    // 2019-07-14

    LocalDate ontem = hoje.minusDays(1);
    System.out.println(hoje);
    // 2019-07-14
    System.out.println(ontem);
    // 2019-07-13

    LocalTime agora = LocalTime.now();

    System.out.println(agora);
    // 23:53:58.421



    System.out.println(agora);
    // 23:53:58.421

    LocalTime maisUmaHora = agora.plusHours(1);

    System.out.println(maisUmaHora);
    // 00:55:37.421

    LocalDateTime agoraDateTime = LocalDateTime.now();

    System.out.println(agoraDateTime);
    // 2019-07-15T00:02:16.076

    LocalDateTime futuro = agoraDateTime.plusHours(1).plusDays(2).plusSeconds(12);

    System.out.println(futuro);
    // 2019-07-17T01:02:28.076


    //Adicione 4anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00
     LocalDateTime exercicio = LocalDateTime.of(2010, 05, 15, 15, 00, 00);
     LocalDateTime exercicioFuturo = exercicio.plusYears(4).plusMonths(6).plusHours(13);

     System.out.println("Resultado do Exercicio: "+ exercicioFuturo);
    }
}
