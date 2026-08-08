import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OrderNumber {
    public String generateOrderNumber(){
        String companyId = "COM";

        long number = ThreadLocalRandom.current()
        .nextLong(10_000_000_000L, 100_000_000_000L);

        return companyId + number;
    }
    public static void main(String[] args) {
        System.out.println(new OrderNumber().generateOrderNumber());
    }
}