import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("*********************Q1********************");
        Map<String, Double> notes=new HashMap<>();
        System.out.println("********************Q2********************");
        notes.put("Ahmed",17.0);
        notes.put("Said",12.5);
        notes.put("hajar",16.5);
        notes.put("Rachid",8.5);
        System.out.println("*********************Q3****************************");
        double noteRachid = notes.get("Rachid");
        notes.replace("Rachid",noteRachid+1);
        System.out.println(notes.get("Rachid"));
        System.out.println("********************Q4***************************");
        notes.remove("Said");
        System.out.println(notes);
        System.out.println("************************Q5*************************");
        int size = notes.size();
        System.out.println(size);
        System.out.println("**************************Q6**************************");
        System.out.println("a-Afficher la note moyenne");
        double somme = 0.0;
        for (double note : notes.values()){
            somme+=note;
        }
        double noteMoyenne = somme / notes.size();
        System.out.println(noteMoyenne);
        System.out.println("b-Afficher la note max");
        double noteMax = notes.values().stream().mapToDouble(Double::doubleValue).max().getAsDouble();
        System.out.println(noteMax);
        System.out.println("c-Afficher la note min");
        double noteMin = notes.values().stream().mapToDouble(Double::doubleValue).min().getAsDouble();
        System.out.println(noteMin);
        System.out.println("**************Q7***************");
        int i = 1;
        for (double note : notes.values()){
            if (note == 20) {
                System.out.println("Note "+i+": True");
            }else {
                System.out.println("Note "+i+": False");
            }
            i++;

        }
        System.out.println("***********Q8**************");
        notes.values().stream().forEach(System.out::println);


    }
}
