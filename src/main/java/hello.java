import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArraySet;

public class hello {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sinav Notunuzu Giriniz : ");


        double not = input.nextDouble();


        Scanner input1 = new Scanner(System.in);

        System.out.println("Final Notunuzu Giriniz : ");

        double finalnot = input.nextDouble();

        double ortalama = ((not / 100) * 40) + ((finalnot / 100) * 60);


        if (ortalama >= 50 && finalnot >= 60) {


            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " Tebrikler geçtiniz");

        } else if (ortalama >= 50 && finalnot <= 59) {

            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz final notunuz sinirin altinda!");
        } else if (ortalama <= 49 && finalnot >= 60) {

            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz ortalamanız sinirin altinda !");
        } else {
            System.out.printf(" Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz ortalamaniz ve Final notunuz sinirin altinda !");

        }


    }


}
