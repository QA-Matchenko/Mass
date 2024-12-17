public class Main {
    public static void main(String[] args) {
        BmiService BmiService = new BmiService();
        double height = 1.64;
        double weight = 50;
        double bmi = weight / (height * height);
        System.out.println("Индекс массы тела" + bmi);
    }
}