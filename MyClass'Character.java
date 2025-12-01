import java.util.Scanner;
import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
        System.out.println("Welcome to our [English] project with the topic [Love and Marriage]!");
        callMethod();
    }
    public static void callMethod(){
        Scanner kb = new Scanner(System.in);
        MyClass why = new MyClass();
        ArrayList<MyCharacter> characters = new ArrayList<>();
        String ans = "";
        while(!ans.equals("Done")){
            System.out.print("What comes next? ");
            ans = kb.nextLine();
            if (ans.startsWith("Create ")) {
                characters.add(new MyCharacter(kb, ans.substring(ans.indexOf(" ")+1)) );
                kb.nextLine(); }
            else if (ans.equals("Compare characters")) {
                System.out.print("First character: ");
                String one = kb.next();
                kb.nextLine();
                System.out.print("Second character: ");
                String two = kb.next();
                int first = 0;
                int second = 0;
                for (int i = 0; i < characters.size(); i++) {
                    if (characters.get(i).getName().equals(one))
                        first = i;
                    if (characters.get(i).getName().equals(two))
                        second = i;
                }
                System.out.println();
                characters.get(first).showMeter(characters.get(second));
                System.out.println();
                System.out.println(characters.get(first).rateComparison(characters.get(second)));
                System.out.println();
                kb.nextLine();
            }
        }
        System.out.print("Thanks for listening!");
    }
}