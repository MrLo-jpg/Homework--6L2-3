public class Main {
    public static void main(String[] args) {
        ;
        System.out.println(calculateDeliveryDays(80));
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int result = -1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            result = 1;
        } else if (deliveryDistance <= 60) {
            result = 2;
        } else if (deliveryDistance <= 100) {
            result = 3;
        }
        return result;

    }
}