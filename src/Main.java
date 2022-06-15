public class Main {
    public static void main(String[] args) {
        int currentSumm = 145;
        int depositAmount = 2200;
        int bonus;
        int finalAmount;
        if (depositAmount > 1000) {
            finalAmount = currentSumm + depositAmount / 100 + depositAmount;
        } else {
            finalAmount = currentSumm + depositAmount;
        }
        System.out.println(finalAmount);
    }
}
