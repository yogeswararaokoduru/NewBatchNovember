public class ExceptionExampleThrow {
    public static void main(String[] args) {

        float AvaliableBalance=10000.0f;
        if (AvaliableBalance<100000)
        {
            throw new NeeDhagaraBalanceLedu("heloo NeeDhagaraBalanceLedu");
        }
    }
}
