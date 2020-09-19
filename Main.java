public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(3.24,75);
        System.out.println("BMI =" + bmi);
    }
}