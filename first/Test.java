package first;

import java.util.Scanner;

public class Test {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Siapa nama Anda? ");
        String nama = input.nextLine();

        System.out.print("Berapa umur Anda? ");
        int umur = input.nextInt();

        System.out.println("Hallo " + nama + " umur kamu " + umur);
        input.close();
    }
}

