import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cardGame{
    public static int tradeCard(List<Integer> list1, List<Integer> list2){
        int counter = 0;
        int Ilist1 = list1.size();
        int Ilist2 = list2.size();
        for (int i=0; i<list1.size(); i++){
            boolean have1 = list2.contains(list1.get(i));
            boolean have2 = list1.contains(list2.get(i));
            if((have1 == false && have2==false) && (counter < Ilist1 && counter < Ilist2)){
                counter++;
                list2.add(list1.get(i));
            }
        }return counter;
    }

    public static void main(String[] args) {
        int alice, betty;
        List<Integer> listAlice = new ArrayList<>();
        List<Integer> listBetty = new ArrayList<>();
        Scanner keybord = new Scanner(System.in);

        System.out.println("how meny cards does alice and betty have:");
        alice = keybord.nextInt();
        betty = keybord.nextInt();

        for (int i=0; i<alice; i++){
            System.out.println("alice card: ");
            int aux = keybord.nextInt();
            listAlice.add(aux);
        }

        for (int i=0; i<betty; i++){
            System.out.println("betty card: ");
            int aux = keybord.nextInt();
            listBetty.add(aux);
        }

         System.out.println("number of trades: " + tradeCard(listAlice, listBetty));
         keybord.close();
    }
}