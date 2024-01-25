package src;

public class Calculator extends ScannerNumber {
    public static void calculator() {

        switch (action) {
            case "SUM":
                int real = real1 + real2;
                int imag = imaginary1 + imaginary2;
                System.out.println("результат сложения: " + real + " + " + (imag) + "i");
                break;

            case "DIFFERENCE":
                double real111 = real1 - real2;
                double imag1 = imaginary1 - imaginary2;
                System.out.println("результат вычитания: " + real111 + " - " + (imag1) + "i");
                break;
            case "MULTIPLICATION":
                double real222 = real1 * real2;
                double imag2 = imaginary1 * imaginary2;
                double real22 = imaginary1 * real2;/* bc  */
                double imag22 = real1 * imaginary2;/* ad  */
                double mult1 = real222 - imag2;
                double mult2 = real22 + imag22;
                System.out.println("результат умножения: " + mult1 + " * " + (mult2) + "i");
                break;
//                (ac - bd) + (bc + ad)i
            case "DIVISION":
                double real3 = real1 * real2;/* ac  */
                double imag3 = imaginary1 * imaginary2; /* bd  */
                double div = imaginary1 * real2;/* bc  */
                double div1 = real1 * imaginary2;/* ad  */
                double div2 = (real3 + imag3)/(real2^2 + imaginary2^2);
                double div3 = (div - div1)/(real2^2 + imaginary2^2);

                System.out.println("результат деления: " + div2 + " + " + (div3) + "i");
                break;

        }
    }
}
