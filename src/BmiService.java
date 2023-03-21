public class BmiService {
    public double calculate(double heightCm, double weightKilo) {
        double bmi = weightKilo / ((heightCm / 100) * (heightCm / 100));
        return bmi;
    }
}