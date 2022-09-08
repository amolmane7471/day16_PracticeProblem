package day16Practice;
public class PrimeNumRange
{
    public static void main(String[] args) {
        System.out.println("Range 0-1000 prime number is : ");
        int stop = 1000;
        for(int i = 0; i<=stop; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    private static boolean isPrime(int number) {
 
        if(number < 2)
            return false;
        for (int i = 2; i<number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
        }
}