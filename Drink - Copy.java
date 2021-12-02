public class Drink {
    int drink1;
    int drink2;
    int drink3;
    int drink4;
    int drink5;
    int drink6;
    int drink7;

    int drink1Size;
    int drink2Size;
    int drink3Size;
    int drink4Size;
    int drink5Size;
    int drink6Size;
    int drink7Size;

    public Drink(int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d1s, int d2s, int d3s, int d4s, int d5s, int d6s, int d7s) {
        drink1 = d1;
        drink2 = d2;
        drink3 = d3;
        drink4 = d4;
        drink5 = d5;
        drink6 = d6;
        drink7 = d7;

        drink1Size = d1s;
        drink2Size = d2s;
        drink3Size = d3s;
        drink4Size = d4s;
        drink5Size = d5s;
        drink6Size = d6s;
        drink7Size = d7s;
    }

    public String toString() {
        return "Pepsi: " + drink1 + drink1Size + " Diet Pepsi: " + drink2 + drink2Size + " Pepsi Crush Orange: " +
                drink3 + drink3Size + " Pepsi Crush Diet Orange: " + drink4 + drink4Size + " Sierra Mist: " + drink5 + drink5Size +
                " Diet Sierra Mist: " + drink6 + drink6Size + " Lemonade: " + drink7 + drink7Size;
    }
}
