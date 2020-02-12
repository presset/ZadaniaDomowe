package ZadaniaDomowe.PakietyWyjatki;

public class Main1 {
    public static void main(String[] args) {
        average("12", "18");
    }
        public static void average(String a, String b){
            try {
                double x = Integer.parseInt(a);
                double y = Integer.parseInt(b);
                System.out.println(x / y);
            } catch (NumberFormatException e) {
                System.out.println(String.format("Nie udało się skonwertować zmiennej a: %s, oraz b: %s do zmiennych typu double", a, b));
            }
        } }

