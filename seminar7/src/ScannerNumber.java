package src;

import java.util.Scanner;


public class ScannerNumber {

    public static int real1;
    public static int real2;
    public static int imaginary1;
    public static int imaginary2;
    public static String action;

    public ScannerNumber() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую составляющую первого комплексного числа: ");
        int real1 = scanner.nextInt();
        this.real1 = real1;

        System.out.println("Введите вторую составляющую первого комплексного числа: ");
        int imaginary1 = scanner.nextInt();
        this.imaginary1 = imaginary1;

        System.out.println("Введите первую составляющую второго комплексного числа: ");
        int real2 = scanner.nextInt();
        this.real2 = real2;

        System.out.println("Введите вторую составляющую второго комплексного числа: ");
        int imaginary2 = scanner.nextInt();
        this.imaginary2 = imaginary2;


        System.out.println("Введите действие, которое нужно произвести с этими числами.\n" +
                "допустимые значения: \n " +
                "  SUM ,\n" +
                "   DIFFERENCE ,\n" +
                "   MULTIPLICATION ,\n" +
                "   DIVISION :");
        String action = scanner.next();

        this.action = action;
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
                double div2 = (real3 + imag3) / (real2 ^ 2 + imaginary2 ^ 2);
                double div3 = (div - div1) / (real2 ^ 2 + imaginary2 ^ 2);

                System.out.println("результат деления: " + div2 + " + " + (div3) + "i");
                break;
    }

//    public static void calculator() {



        }



}




