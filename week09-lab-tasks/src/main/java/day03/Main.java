package day03;

public class Main {
    public static void main(String[] args) {
        Caesar caesar = new Caesar(13);
        System.out.println(caesar.encrypts("Legyen ez egy tikositott szoveg"));
        System.out.println(caesar.encrypts(caesar.encrypts("Legyen ez egy tikositott szoveg")));
    }
}
