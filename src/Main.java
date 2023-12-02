public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightInMeters = 1.87F;
        float weightInKilogram = 98F;
        int myIndexBmi;

        myIndexBmi = service.calculate(heightInMeters, weightInKilogram);
        System.out.println("Ваш индекс массы тела: " + myIndexBmi);
    }
}
