import java.text.DecimalFormat;

public class BMICalculator {
    public static void main(String[] args) throws Exception {
        bmiCalculator(1.78, 78);
    }

    public static void bmiCalculator(double height, double weight) {
        DecimalFormat formatter = new DecimalFormat();
        double bmi = weight / (height * height);
        
        if (bmi < 18.5) {
            System.out.println("Underweight! a.k.a Eat MORE!!! \nBMI: " + formatter.format(bmi));
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("Normal! a.k.a Stay Like this!!! \nBMI: " + formatter.format(bmi));
        } else if (bmi > 24.9 && bmi < 29.9) {
            System.out.println("Overweight! a.k.a Start Diet!!! \nBMI: " + formatter.format(bmi));
        } else {
            System.out.println("Obese! a.k.a You are Really Fat!!! \nBMI: " + formatter.format(bmi));
        }
    }
}
