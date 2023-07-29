import java.util.*;

class FunChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's Play Rock Paper Scissors!");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors");
        System.out.println("type 'yes' if you are ready!");
        String ans = sc.nextLine();
        String opt, winner;
        String CompChoice;
        if (ans.equals("yes")) {
            System.out.println("Great, shoot");
            opt=sc.nextLine();
            CompChoice=options();
            winner= winner(opt, CompChoice);
            System.out.println(winner);
        }
    }

    public static String options() {
        int random= (int)(Math.random()*3);
        String choice="";
        if(random==0){
            choice="Stone";
        }
        else if(random==1){
            choice="Paper";
        }
        else if(random==3){
            choice="Scissor";
        }
        return choice;
    }

    public static String winner(String user, String CompChoice) {
        switch(user){
            case "Stone" : 
            if(CompChoice.equals("Paper")){
                return "Computer Won";
            }
            else if(CompChoice.equals("Scissor")){
                return "You Won";
            }
            else if(CompChoice.equals("Stone"))
            {
                return "Tie";
            }
            case "Paper":
            if(CompChoice.equals("Stone")){
                return "User Won";
            }
            else if(CompChoice.equals("Scissor")){
                    return "Computer won";
                }
            else if(CompChoice.equals("Paper")){
                return "Tie";
            }
            case "Scissor":
            if (CompChoice.equals("Stone")){
                return "Computer Won";
            }
            else if(CompChoice.equals("Paper")){
                return "You won";
            }
            else if (CompChoice.equals("Scissor")) {
                return "Tie";
            }
            default:
            return "Wrong Choice";
        }

    }
} 