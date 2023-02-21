import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        String a = new Scanner(System.in).nextLine().toUpperCase();
        switch (a) {
            case "MARS" -> System.out.println(Planet.MARS.getCounty());
            case "JUPITER" -> System.out.println(Planet.JUPITER.getCounty());
            case "VENUS" -> System.out.println(Planet.VENUS);
            case "MERCURY" -> System.out.println(Planet.MERCURY);

        }

    }

}

    /*Күн системасындагы планеталарга enum түзүңүз (Earth, Mars, Saturn ...)
Консолдон бир планетаны белгилеңиз. Эгер Mars болсо - анда "Марс жер планетасына окшош" же Jupiter болсо - анда "Юпитер күн системасындагы эң чоң планета" деп планетага жараша маалыматты консолго чыгарыңыз.
        Планета тууралуу маалыматты кыргыз тилинде көрсөтүңүз.*/