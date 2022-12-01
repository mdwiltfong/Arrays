import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
       /* class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+ " was clicked");
            }

        }
        btnPrint.setOnClickListener(new ClickListener());*/
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked.");
            }
        });
        listen();


 /*
 GearBox mcLaren= new GearBox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));*/

       /*
       GearBox.Gear first = mcLaren.new Gear(1,12.3);
        The following will raise an error.
        GearBox.Gear second = new GearBox.Gear(2,15.4);
        GearBox.Gear third = new GearBox.Gear(3,17.8);
        GearBox.Gear third = new mcLaren.Gear(3,17.8);
        */


    }
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }

        }
    }
}
