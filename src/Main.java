public class Main {
    public static void main(String[] args) {
        //numeros primos
        int num = 1;
        int count = 0;
        while (count < 9) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        return (num % 2 != 0) ;
    }
}