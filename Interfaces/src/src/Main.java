public class Main {
    public static void main(String[] args) {
        GearBox mcLaren= new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1,12.3);
       /*
        The following will raise an error.
        GearBox.Gear second = new GearBox.Gear(2,15.4);
        GearBox.Gear third = new GearBox.Gear(3,17.8);
        GearBox.Gear third = new mcLaren.Gear(3,17.8);
        */

        System.out.println(first.driveSpeed(1000));
        System.out.println();

    }
}
