public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        // Creating a new instance of the class Wizard and Warlock.
        Wizard Nigel = new Wizard("Nigel", 25,150,200);
        Warlock Cyril = new Warlock("Cyril", 20, 100, 150);
       
        // Calling the methods of the class Wizard and Warlock.
        Nigel.nameDisplay();
        Cyril.nameDisplay();

        Nigel.flamethrower(Cyril);
        Nigel.showStats();
        Cyril.showStats();

        Cyril.IceSpear(Nigel);
        Nigel.showStats();
        Cyril.showStats();

        Nigel.healSpell();
        Nigel.showStats();
        Cyril.showStats();

        Cyril.blizzard(Nigel);
        Nigel.showStats();
        Cyril.showStats();

        Nigel.Fireball(Cyril);
        Nigel.levelUp();
    }
}
