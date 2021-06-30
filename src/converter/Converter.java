package converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        int in1 = 120;
        int expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("120 rubles are 2 dollar. Test result : " + passed1);

    }
}
