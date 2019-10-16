import java.util.Scanner;
public class rockpaperscissors
{
   public static void main(String arg[]){
       String player=" ";
       String com=" ";
       String y="yes";
       String c="";
       int won=0;
       int lose=0;
       int tie=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("What do you throw?  [1] Rock, [2] scissors, [3] paper?");
       int a=sc.nextInt();
       int b=(int)(Math.random()*3)+1;
       
       while(y.equals("yes") && a<4){
       if(a==1){
          player="rock";}
        if(a==2){
          player="scissors";
        }
         if(a==3){
          player="paper";   } 
           if(b==1){
          com="rock";
        }
        if(b==2){
          com="scissors";   } 
         if(b==3){
          com="paper";   }
            y="no";
             System.out.println(player);
         System.out.println(com);
         
         if(a==1 &&b==3){
             System.out.println("HaHa! I won you lose!");
             lose++;
            }
          if(a==2 &&b==1){
               System.out.println("HaHa! I won you lose!");
               lose++;
            }
          if(a==1 &&b==2){
               System.out.println("That's impossible! You are cheating!");
               won++;
            }
         
            if(a==3 &&b==1){
                 System.out.println("That's impossible! You are cheating!");
                 won++;
            }
            if(a==3 &&b==2){
                  System.out.println("HaHa! I won you lose!");
                  lose++;
            }
            if(a==2 &&b==3){
                   System.out.println("That's impossible! You are cheating!");
            won++;
                }
         if(player==com){
              System.out.println("You are good! You almost beat me!");
              tie++;
            }
           
         }
            System.out.println("Play again? [yes] [no]");
            c=sc.next();
   
            while(c.equals("yes")){
                y="yes";
                System.out.println("What do you throw?  [1] Rock, [2] scissors, [3] paper?"); 
                a=sc.nextInt();
                b=(int)(Math.random()*3)+1;
                while(y.equals("yes") && a<4){
          if(a==1){
          player="rock";}
        if(a==2){
          player="scissors";
        }
         if(a==3){
          player="paper";   } 
           if(b==1){
          com="rock";
        }
        if(b==2){
          com="scissors";   } 
         if(b==3){
          com="paper";   } 
            y="no";
             System.out.println(player);
         System.out.println(com);
         
         if(a==1 &&b==3){
         System.out.println("HaHa! I won you lose!");
         lose++;
            }
          if(a==2 &&b==1){
               System.out.println("HaHa! I won you lose!");
               lose++;
            }
          if(a==1 &&b==2){
               System.out.println("That's impossible! You are cheating!");
               won++;
            }
            if(a==3 &&b==1){
                 System.out.println("That's impossible! You are cheating!");
                 won++;
            }
            if(a==3 &&b==2){
                  System.out.println("HaHa! I won you lose!");
                  lose++;
            }
            if(a==2 &&b==3){
                   System.out.println("That's impossible! You are cheating!");
            won++;
                }
         if(player==com){
              System.out.println("You are good! You almost beat me!");
            tie++;
            } }
            System.out.println("Play again? [yes] [no]");
            c=sc.next();
        }
        System.out.println("bye bye");
        System.out.println("won:" +won);
        System.out.println("lost:" +lose);
        System.out.println("tie:" +tie);
    }
}
