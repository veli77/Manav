import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double  Armut = 2.14, ArmutKilo,
                Elma = 3.67, ElmaKilo,
                Domates = 1.11, DomatesKilo,
                Muz = 0.95, MuzKilo,
                Patlican = 5.0, PatlicanKilo,Toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo: ");
        ArmutKilo = input.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        ElmaKilo = input.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        DomatesKilo = input.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        MuzKilo = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo: ");
        PatlicanKilo = input.nextDouble();
        Toplam = Armut * ArmutKilo
                + Elma * ElmaKilo
                + Domates * DomatesKilo
                + Muz * MuzKilo
                + Patlican * PatlicanKilo;
        System.out.println("Toplam:"+ Toplam);
    }
}
