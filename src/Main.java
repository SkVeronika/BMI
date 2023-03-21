public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(164, 65);
        int bmi = (int) imt;

        System.out.println("Индекс массы тела: " + bmi);
    }
}