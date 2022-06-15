public class Main {
    public static void main(String[] args) {
        int CurrentSumm = 145;
        int DepositAmount = 2200;
        int bonus;
        int FinalAmount;
        if (DepositAmount > 1000) {
            FinalAmount = CurrentSumm + DepositAmount / 100 + DepositAmount;
        } else {
            FinalAmount = CurrentSumm + DepositAmount;
        }
        System.out.println(FinalAmount);
    }
}
