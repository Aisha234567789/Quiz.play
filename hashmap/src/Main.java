 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> capital = new HashMap<>();
        capital.put("Russia", "Moskau");
        capital.put("German", "Berlin");
        capital.put("Polen", "Warsaw");
        capital.put("Romania", "Bucharest");
        capital.put("Spain", "Madrid");
        capital.put("Italy ", "Rom");
        capital.put("France", "Paris");
        capital.put("Egypt", "Cairo");
        capital.put("Mexico", "Mexico City");

        List<String> countries = new ArrayList<>();
        countries.addAll(capital.keySet());

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        while (true){
            int i = random.nextInt(countries.size());
            String country = countries.get(i);
            System.out.println("What is the Capital city in " + country);
            if(scan.next().equals(capital.get(country))){
                System.out.println("Richtig!");
            } else {
                System.out.println("Leider Falsch!");
                System.out.println("Richtig wäre: " + capital.get(country));
            }
        }
    }
}