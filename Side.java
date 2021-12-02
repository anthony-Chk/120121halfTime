public class Side {
    boolean s1Marinara;
    boolean s2Marinara;
    int s1Quantity;
    int s2Quantity;
    int s3Quantity;

    public Side(boolean s1m, boolean s2m, int s1Num, int s2Num, int s3Num) {
        s1Marinara = s1m;
        s2Marinara = s2m;
        s1Quantity = s1Num;
        s2Quantity = s2Num;
        s3Quantity = s3Num;
    }

    public String toString() {
        return "Breadsticks Quantity: " + s1Quantity + " Marinara: " + s1Marinara +
                "\nBreadstick Bites Quantity: " + s2Quantity + " Marinara: " + s2Marinara +
                "\nCookie Quantity: " + s3Quantity;
    }
}
