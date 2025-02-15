import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

     private static Scanner input = new Scanner(System.in);
     
     public void Start()
     {
        System.out.println("Welcome to Game");

        System.out.println("İsminizi Giriniz:");
        String playerName = input.nextLine();



        Player player = new Player(playerName);
        System.out.println(player.getName()+ "Welcome");


        player.selectCharacter();

        while(true)
        {
            player.printPlayer();

            System.out.println("**************************************");
            System.out.println("Bölgeler");
            System.out.println("1 - Güvenli Ev\n2 - Dükkan\n3 - Mağara\n4 - Orman\n5 - Nehir\n6 - Maden\n0 - Çıkış Yap");
        
            System.out.println("******************************************");

            int locationChoice=0;
            boolean isChoiceValid = false;
            boolean isAvailableLocation ;
            Location location = null ;

           do {
                isAvailableLocation = true;
                try {
                    System.out.print("Gitmek istediğiniz yeri seçiniz: ");
                    locationChoice = input.nextInt();

                    if (locationChoice == 3 && player.getInventory().isFood()){
                        isAvailableLocation = false;
                    }else if (locationChoice == 4 && player.getInventory().isFirewood()){
                        isAvailableLocation = false;
                    }else if (locationChoice == 5 && player.getInventory().isWater()) {
                        isAvailableLocation = false;
                    }

                    System.out.println();
                    if (isAvailableLocation) {
                        switch (locationChoice) {
                            case 0:
                                isChoiceValid = true;
                                break;
                            case 1:
                                System.out.println("Güvendesiniz");
                                System.out.println("Can Yenilendi");
                                location = new HouseSafe(player);
                                isChoiceValid = true;
                                break;
                            case 2:
                                location = new Store(player);
                                isChoiceValid = true;
                                break;
                            case 3:
                                location = new Cave(player);
                                isChoiceValid = true;
                                break;
                            case 4:
                                location = new Forest(player);
                                isChoiceValid = true;
                                break;
                            case 5:
                                location = new River(player);
                                isChoiceValid = true;
                                break;
                            case 6:
                                location = new Mine(player);
                                isChoiceValid = true;
                                break;
                            default:
                                System.out.println("Geçerli bir bölge seçiniz!");
                        }
                    }else {
                        System.out.println("Bu bölgeyi temizlediniz.Buraya tekrar giremezsiniz.");
                    }
                } catch(InputMismatchException | NullPointerException e){
                    System.out.println("Bir rakam giriniz");
                }
                input.nextLine();
            }while(!isChoiceValid);

            if (location.getName().toLowerCase().equals("güvenli ev") && !location.onLocation()){
                return;
            }

            if (location == null || !location.onLocation()){
                System.out.println("Oyun bitti!");
                return;
            }
        }
     }





}
