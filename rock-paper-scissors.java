import java.util.*;

class rockpaperscissors
 {
      public static void main(String args[])
      {
         Scanner s=new Scanner(System.in);
       
         do
         {
           char rps=userplay();
           int num=cpuplay();
           win(rps,num);
           System.out.println("---------------------------------------");
           System.out.println("Do you want to play again? [Y/N]");
           char ch=s.next().charAt(0);
           System.out.println();
           if(ch=='N' || ch=='n')
           break;

         } while(true);

         s.close();
      }


      public static char userplay()
      {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter user input (R=[Rock],P=[Paper],S=[Scissor])");
          char c = sc.next().charAt(0);

          System.out.println("---------------------------------------");

          if (c == 'R')
              System.out.println("USER: Rock");
          if (c=='P')
              System.out.println("USER: Paper");
          if (c == 'S')
              System.out.println("USER: Scissor");

          return c;
      }


      public static int cpuplay()
      {
          Random rand = new Random();
          int num = rand.nextInt(5) + 0;

          if(num==0 || num==3)
          {
          System.out.println("CPU: Rock");
          num=0;
          }
          if (num == 1 || num==4)
          {
          System.out.println("CPU: Paper");
          num=1;
          }
          if (num == 2 || num==5)
          {
          System.out.println("CPU: Scissor");
          num=2;
          }

          return num;
      }



      public static void win(char rps,int num)
      {
         switch(rps)
         {
            case 'R':
            if(rps=='R' && num==0)
            System.out.println("It's a tie");
            if (rps == 'R' && num == 1)
            System.out.println("CPU wins!");
            if (rps == 'R' && num == 2)
            System.out.println("You win!");
            break;


            case 'P':
            if (rps == 'P' && num == 0)
                System.out.println("You win!");
            if (rps == 'P' && num == 1)
                System.out.println("It's a tie ");
            if (rps == 'P' && num == 2)
                System.out.println("CPU wins!");
                break;


            case 'S':
            if (rps == 'S' && num == 0)
                System.out.println("CPU wins!");
            if (rps == 'S' && num == 1)
                System.out.println("You win!");
            if (rps == 'S' && num == 2)
                System.out.println("It's a tie");
                break;
         }
      }
}
