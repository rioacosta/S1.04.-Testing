package nivel1.ex2;

public class CalculoDni {
    private static final String LETTEREXPECTED = "TRWAGMYFPDXBNJZSQVHLCKE";
    private int userNumber;
    private int total;

    public CalculoDni (int userNumber) {
        this.userNumber = userNumber;
        this.total = userNumber % 23;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public int getTotal() {
        return this.total;
    }
    public char getLetterExpected() {
        return LETTEREXPECTED.charAt(total);
    }

}
