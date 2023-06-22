package foodApp;
import java.io.IOException;
import java.util.*;
import java.lang.*;
public class food_main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        loginScreen(sc);
    }
    public static void Exit()
    {
        return;
    }
    public static void Mc()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("                  ****************************************************************************                 ");
        System.out.println("                       1.burger \t 2.pizza \t 3.chicken leg \t 4.cake\t5.Main Page\t6.Exit                              ");
        System.out.println("                  *****************************************************************************                ");
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("                    burger add to your bag::");
                Add_more();
                break;
            }
            case 2: {
                System.out.println("                    pizza add to your bag::");
                Add_more();
                break;
            }
            case 3: {
                System.out.println("                    chicken leg add to your bag::");
                Add_more();
                break;
            }
            case 4: {
                System.out.println("                    cake add to your bag::");
                Add_more();
                break;
            }
            case 5:
            {
                App();
                break;
            }
            case 6:
            {
                Exit();
                break;
            }

            default: {
                System.out.println("                    wrong choice::try again");
                Mc();
                break;
            }

        }

    }
    public static void KFC()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                                  *************************************************************************      ");
        System.out.println("                                         1.burger\t2.Biryani\t3.chicken leg\t4.cake\t5.Main Page\t6.Exit                                                  ");
        System.out.println("                                   ************************************************************************      ");
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("                             burger add to your bag::");
                Add_more();

                break;
            }
            case 2: {
                System.out.println("                              Biryani add to your bag::");
                Add_more();
                break;
            }
            case 3: {
                System.out.println("                            chicken leg add to your bag::");
                Add_more();

                break;
            }
            case 4: {
                System.out.println("                            cake add to your bag::");
                Add_more();

                break;
            }
            case 5:
            {
                App();
                break;
            }
            case 6:{
                Exit();
                break;
            }
            default: {
                System.out.println("                           wrong choice::try again");
                KFC();
                break;
            }
        }
    }
    public static void Burger()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                               ***********************************************************************        ");
        System.out.println("                                 1.burger \t 2.taco \t 3.chicken leg \t 4.cake \t 5.Main Page\t6.Exit         ");
        System.out.println("                               ************************************************************************       ");
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("                        burger add to your bag::");
                Add_more();
                break;
            }
            case 2: {
                System.out.println("                          taco add to your bag::");
                Add_more();
                break;
            }
            case 3: {
                System.out.println("                          chicken leg add to your bag::");
                Add_more();
                break;
            }
            case 4: {
                System.out.println("                          cake add to your bag::");
                Add_more();

                break;
            }
            case 5:
            {
                App();
                break;
            }
            case 6:
            {
            Exit();
            break;
            }
            default: {
                System.out.println("wrong choice::try again");
                Burger();
                break;
            }
        }
    }
    public static void Domino()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                           ******************************************************************************              ");
        System.out.println("                               1.Garlic bread \t 2.pizza \t 3.chicken leg \t 4.cake \t5.Main Page\t6.Exit                  ");
        System.out.println("                           ******************************************************************************              ");
        int b = sc.nextInt();
        switch (b) {
            case 1: {
                System.out.println("                               Garlic bread add to your bag::");
                Add_more();
                payment();
                break;
            }
            case 2: {
                System.out.println("                               pizza add to your bag::");
                Add_more();
                payment();
                break;
            }
            case 3: {
                System.out.println("                               chicken leg add to your bag::");
                Add_more();
                payment();
                break;
            }
            case 4: {
                System.out.println("                               cake add to your bag::");
                Add_more();
                payment();
                break;
            }
            case 5:
            {
                App();
                break;
            }
            case 6:
            {
            Exit();
            break;
            }

            default: {
                System.out.println("                            wrong choice::try again");
                Domino();
                break;
            }
        }
    }

    public static void App()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("                                   Welcome user::");
        System.out.println("                          ***********************************             ");
        System.out.println("                               Welcome to foodApp::                          ");
        System.out.println("                          ************************************            ");
        System.out.println("                    ******************************************************************************     ");
        System.out.println("                      1.MACDONALD \t 2.KFC \t 3.BURGER KING \t 4.Domino's\t5.back Menu\t6.Exit        ");
        System.out.println("                    ******************************************************************************     ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("                  *******************************        ");
                System.out.println("                     welcome to MACDONALD::            ");
                System.out.println("                  *******************************       ");
                System.out.println("click 1 for order Food");
                System.out.println("click 2 for the back menu");
                System.out.println("click 3 for Exit");
                int a = sc.nextInt();
                switch (a)
                {
                    case 1:
                    {
                        Mc();
                        break;

                    }
                    case 2:
                    {
                        App();
                        break;
                    }
                    case 3:
                    {
                         Exit();
                         break;
                    }
                    default: {
                        System.out.println("                         wrong choice::go to Main Page::");
                        App();
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println("                  ***************************        ");
                System.out.println("                     Welcome to KFC::                 ");
                System.out.println("                  **************************         ");
                System.out.println("click 1 for order Food");
                System.out.println("click 2 for the back menu");
                System.out.println("click 3 for Exit");
                int a = sc.nextInt();
                switch (a)
                {
                    case 1:
                    {
                        KFC();
                        break;
                    }
                    case 2:
                    {
                       App();
                        break;
                    }
                    case 3:
                    {
                    Exit();
                    break;
                    }
                    default: {
                        System.out.println("                      wrong choice::go to Main Page::");
                        App();
                        break;
                    }
                }
                break;
            }
            case 3: {
                System.out.println("                          ****************************                 ");
                System.out.println("                             Welcome to BURGER KING::                  ");
                System.out.println("                          ****************************                  ");
                System.out.println("click 1 for order Food");
                System.out.println("click 2 for the back ");
                System.out.println("click 3 for Exit");
                int a = sc.nextInt();
                switch (a)
                {
                    case 1:
                    {
                      Burger();
                        break;

                    }
                    case 2:
                    {
                        App();
                        break;
                    }
                    case 3:
                    {
                        Exit();
                        break;
                    }
                    default: {
                        System.out.println("                     wrong choice::go to Main Page::");
                       App();
                    }
                }
                break;
            }

            case 4: {
                System.out.println("                   ****************************               ");
                System.out.println("                       Welcome to Domino's::                  ");
                System.out.println("                   ****************************               ");
                System.out.println("click 1 for order Food");
                System.out.println("click 2 for the back menu");
                System.out.println("click 3 for Exit");
                int a = sc.nextInt();
                switch (a)
                {
                    case 1:
                    {
                       Domino();
                        break;

                    }
                    case 2:
                    {
                        App();
                        break;
                    }
                    case 3:
                    {
                        Exit();
                    }
                    default: {
                        System.out.println("                         wrong choice::go to Main Page::");
                        App();
                    }
                }
                break;
            }
            case 5:
            {
            App();
            break;
            }
            case 6:
            {
                Exit();
                break;
            }
            default: {
                System.out.println("                              wrong choice::go to Main Page::");
                App();
            }
        }
    }
    public static void payment()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                    *******************************");
        System.out.println("                                       welcome to payment page::     ");
        System.out.println("                                    *******************************");
        System.out.println("                             ************************************************************************************************");
        System.out.println("                                 1.for card payment\t2.for wallet payment\t3.for case payment\t4.Main Page\t5.Back page\t6.Exit");
        System.out.println("                             ************************************************************************************************");
        int n = sc.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.println("card payment complited::Thanks for ordering");
                break;
            }
            case 2:
            {
                System.out.println("wallet payment complited::Thanks for ordering");
                break;
            }
            case 3:
            {
                System.out.println("case payment complited::Thanks for ordering");
                break;
            }
            case 4:
            {
                App();
                break;
            }
            case 5:
            {
                Add_more();
                break;
            }
            case 6:
            {
                Exit();
                break;
            }
            default: {
                System.out.println("                                  wrong choice:: try agin");
                payment();
            }
        }
    }
    public static void Add_more()
    {
        System.out.println("                                   **************************************             ");
        System.out.println("                                       Welcome to add more page::                   ");
        System.out.println("                                   ***************************************            ");
        System.out.println("                      ***************************************************************************************************          ");
        System.out.println("                         1.Add French Fries \t 2.Add coffee \t 3.Add drinks \t 4.Add Dip \t5.Main Page \t 6.Exit");
        System.out.println("                      ***************************************************************************************************          ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        switch (n) {
            case 1:
            {
                Fries();
                break;
            }
            case 2:
            {
             Coffee();
             break;
            }
            case 3:
            {    Drinks();
                break;
            }
            case 4:
            {
                Dips();
                break;
            }
            case 5:
            {
            App();
            break;
            }
            case 6:
            {
                Exit();
                break;
            }
            default:
             {
                 System.out.println("                        wrong choice::try again");
                Add_more();
                break;
            }
        }
    }
    public static void Fries()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                                 *****************************************************************************");
        System.out.println("                                            1.Large \t 2.Medium \t 3.Small \t 4.Main Page \t 5.Exit ");
        System.out.println("                                 ******************************************************************************");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.println("                            Large Fries addded Successfully::");
                break;
            }
            case 2:
            {
                System.out.println("                            Medium Fries added successfully::");
                break;
            }
            case 3:
            {
                System.out.println("                            Small Fries added successfully::");
                break;
            }
            case 4:
            {
                App();
                break;
            }
            case 5:
            {
                Exit();
                break;
            }

            default:
            {
                System.out.println("                            wrong choice::try again::");
                Fries();
                break;
            }
        }
    }
      public static void Coffee()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("                                 ***********************************************************************************");
          System.out.println("                                     1.Espresso \t 2.Cappuccino \t 3.Latte \t 4.Americano \t 5.Main Page \t6.Exit ");
          System.out.println("                                 ***********************************************************************************");
          int n = sc.nextInt();
          switch (n)
          {
              case 1:
              {
                  System.out.println("                                   Espresso added successfully::");
                  break;
              }
              case 2:
              {
                  System.out.println("                                   Cappuccino added successfully::");
                  break;
              }
              case 3:
              {
                  System.out.println("                                   Latte added successfully::");
                  break;
              }
              case 4:
              {
                  System.out.println("                                   Americano added successfully::");
                  break;
              }
              case 5:
              {
                  App();
                  break;
              }
              case 6:
              {
                  Exit();
                  break;
              }
              default:
              {
                  System.out.println("                                   wrong choice::try again");
                  Coffee();

              }
          }
      }
      public static void Drinks()
       {
       Scanner sc=new Scanner(System.in);
          System.out.println("                         *************************************************************************************");
          System.out.println("                                     1.juices \t 2.Energy Drink \t 3.Mocktails \t 4.Main Page \t 5.Exit ");
          System.out.println("                         **************************************************************************************");
          int n=sc.nextInt();
          switch (n)
          {
              case 1:
              {
                  juices();
                  break;
              }
              case 2:
              {
                  Energy_Drink();
                  break;
              }
              case 3:
              {
                Mocktails();
                  break;
              }
              case  4:
              {
                  App();
                  break;
              }
              case 5:
              {
                  Exit();
                  break;
              }

              default:
              {
                  System.out.println("                          wrong choice :: try again");
                  Drinks();
                  break;
              }

          }
      }
      public static void juices()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("                          ********************************************************************************* ");
          System.out.println("                            1.Orange juice \t 2.Pomegranate juice \t 3.Pineapple juice \t 4.Grape juice \t5.Exit   ");
          System.out.println("                          *********************************************************************************");
          int n=sc.nextInt();
         switch (n)
         {
             case 1:
             {
                 System.out.println("                    Orange juice added successfully::");
                 payment();
                 break;
             }
             case 2:
             {
                 System.out.println("                    Pomegranate juice added successfully::");
                 payment();
                 break;
             }
             case 3:
             {
                 System.out.println("                    Pineapple juice added successfully::");
                 payment();
                 break;
             }
             case 4:
             {
                 System.out.println("                    Grape juice added successfully::");
                 payment();
                 break;
             }
             case 5:
             {
                 Exit();
                 break;
             }
             default:
             {
                 System.out.println("                    wrong choice:: try again");
                 juices();
             }
         }
      }
      public static void Energy_Drink()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("                        **************************************************************************");
          System.out.println("                                   1.Hell \t 2.Red Bull \t 3.Sting \t4.Monster \t 5.Exit");
          System.out.println("                        **************************************************************************");
          int n=sc.nextInt();
          switch (n)
          {
              case 1:
              {
                  System.out.println("                       Hell added successfully::");
                  payment();
                  break;
              }
              case 2:
              {
                  System.out.println("                       Red Bull added successfully::");
                  payment();
                  break;
              }
              case 3:
              {
                  System.out.println("                       Sting added successfully::");
                  payment();
                  break;
              }
              case 4:
              {
                  System.out.println("                       Monster added successfully::");
                  payment();
                  break;
              }
              case 5:
              {
                  Exit();
                  break;
              }
              default:
              {
                  System.out.println("                       wrong choice ::try choice");
                  Energy_Drink();
              }
          }
      }

      public static void Mocktails()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("                      *************************************************************************************  ");
          System.out.println("                        1.Mojito \t 2.Virgin pina colada \t 3.Shirley Temple \t 4.Pina colada \t 5.Exit     ");
          System.out.println("                      *************************************************************************************  ");
          int n=sc.nextInt();
          switch (n)
          {
              case 1:
              {
                  System.out.println("               Mojito added successfully::");
                  payment();
                  break;
              }
              case 2:
              {
                  System.out.println("               Virgin pina colada added successfully::");
                  payment();
                  break;
              }
              case 3:
              {
                  System.out.println("               Shirley Temple added successfully:: ");
                  payment();
                  break;
              }
              case 4:
              {
                  System.out.println("               Pina colada added successfully::");
                  payment();
                  break;
              }
              case 5:
              {
                  Exit();
                  break;
              }
              default:
              {
                  System.out.println("              wrong choice :: try again");
                  Mocktails();
              }
          }
      }
    public static void Dips()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                             *********************************************************************************************         ");
        System.out.println("                                  1.Salsa Dip \t 2.Feta Dip 3.Meyo dip \t 4.Cheesy Marinara Dip \t 5.Main Page \t 6.Exit            ");
        System.out.println("                             *********************************************************************************************        ");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            {
                System.out.println("              Salsa Dip added successfully::");
                break;
            }
            case 2:
            {
                System.out.println("              Feta Dip added successfully::");
                 break;
            }
            case 3:
            {
                System.out.println("              Meyo Dip added successfully::");
                break;
            }
            case 4:
            {
                System.out.println("              Cheesy Dip added successfully::");
             break;
            }
            case 5:
            {
                App();
                break;
            }
            case 6:
            {
                Exit();
                break;
            }

            default:
            {
                System.out.println("              wrong choice::try again::");
                Dips();
                break;
            }

        }
    }

    public static void loginScreen(Scanner sc)
    {

        String email_id;
        String password;

        System.out.println("enter email_id:");
        email_id = sc.nextLine();
        System.out.println("enter your password:");
        password = sc.nextLine();
        if (!email_id.equalsIgnoreCase("faraz") || !password.equalsIgnoreCase("Wel")) {
            System.out.println("Invalid user");
            loginScreen(sc);
        }
        else
        {
           App();
        }
    }
}






