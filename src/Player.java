import java.util.ArrayList;

public class Player {
    private Inventory inventory;
    private Wallet wallet;
    private ArrayList<Cup> Cups;
    private ArrayList<Lemon> lemons;
    private ArrayList<Sugar> cupsOfSugar;
    private ArrayList<Ice> iceCubes;

    public Player(Inventory inventory, Wallet wallet, ArrayList<Cup> cups, ArrayList<Lemon> lemons, ArrayList<Sugar> cupsOfSugar, ArrayList<Ice> iceCubes) {
        this.inventory = inventory;
        this.wallet = wallet;
        Cups = cups;
        this.lemons = lemons;
        this.cupsOfSugar = cupsOfSugar;
        this.iceCubes = iceCubes;
    }
}
