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


            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " Tebrikler gectiniz");

        } else if (ortalama >= 50 && finalnot <= 59) {

            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz final notunuz sinirin altinda!");
        } else if (ortalama <= 49 && finalnot >= 60) {

            System.out.printf("Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz ortalamanız sinirin altinda !");
        } else {
            System.out.printf(" Ortalamanız : " + ortalama + " Final notunuz : " + finalnot + " kaldiniz ortalamaniz ve Final notunuz sinirin altinda !");

        }


        System.out.printf("\n");


        System.out.printf("Kacinci ayi ogrenmek istersiniz ?");


        int aylar = input.nextInt();
        switch (aylar) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
        }


    }


}
