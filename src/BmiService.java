public class BmiService {
    public int calculate(float heightInMeters, float weightInKilogram) {
        int bmiIndex;

        bmiIndex = (int) (weightInKilogram / (heightInMeters * heightInMeters));
        return bmiIndex;
    }
}
