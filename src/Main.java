import java.util.*;



public class Main {

    public static void addArrList(ArrayList arr, Scanner kb)
    {
        int position = 0;
        String input = "";


        input = SafeInput.getNonZeroLenString(kb, "Input what you would like to add");

        arr.add(input);

    }

    public static void delArrList(ArrayList arr, Scanner kb)
    {
        int position = 0;

        position = SafeInput.getInt(kb, "What item number would you like to delete?")-1;

        arr.remove(position);

        kb.nextLine();
    }

    public static void viewArrList(ArrayList arr)
    {
        for (int length = 0; length < arr.size(); length++)
        {
            String var = (String) arr.get(length);
            System.out.println((length+1) + ". " + var);
        }
    }











    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        boolean done = false;
        String userInput = "";

        System.out.println("Welcome.  Select an option to get started.");

        ArrayList<String> myArrList = new ArrayList<>();

        while (!done)
        {
            System.out.println("\n[A]dd an item.\n[D]elete an item.\n[P]rint the list\n[Q]uit the program.");

            userInput = SafeInput.getRegExString(kb, "Your selection", "[AaDdPpQq]");


                if (userInput.equalsIgnoreCase("a"))
                {
                    addArrList(myArrList, kb);
                }

                if (userInput.equalsIgnoreCase("d"))
                {
                    delArrList(myArrList, kb);
                }

                if (userInput.equalsIgnoreCase("p"))
                {
                    viewArrList(myArrList);
                }

                if (userInput.equalsIgnoreCase("q"))
                {
                    done = SafeInput.getYNConfirm(kb, "Are you sure you would like to quit? [Y][N] ");
                }




        }






    }
}