import java.util.*;

public class ShoppingList
{
    public static void main(String[] args)
    {
        System.out.println("\t\t\t\t▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲");
        System.out.println("\t\t\t\t▼▲▼▲▼▲▼ Welcome to my Shopping List ▲▼▲▼▲▼▲");
        System.out.println("\t\t\t\t▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲▼▲\n");
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.run();
    }

    private void run()
    {
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        ArrayList<ListItem> listItems = new ArrayList<>();


        do
        {
            System.out.println("\nEnter a command [Add, Print, Remove, Clear, Sort, Find, or Exit]");

            String commandLine = in.nextLine();
            String[] words = commandLine.split(" ");
            ListItem[] copyList = new ListItem[words.length - 1];

            int index = 1;
            for (int i = 0; i < copyList.length; i++)
            {
                copyList[i] = new ListItem(words[index]);
                index++;
            }

            String command = words[0];
            command = command.toUpperCase();

            switch (command)
            {
                case "ADD":
                    addItem(listItems, copyList);
                    break;
                case "PRINT":
                    print(listItems);
                    break;
                case "REMOVE":
                    removeItem(listItems, words);
                    break;
                case "CLEAR":
                    clear(listItems);
                    break;
                case "SORT":
                    sort(listItems);
                    break;
                case "FIND":
                    find(listItems, copyList);
                    break;
                case "EXIT":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command, try again");
            }


        } while (!exit);
        System.out.println(listItems);
    }

    private void addItem(ArrayList<ListItem> listItems, ListItem[] copyList)
    {
        //listItems.addAll(Arrays.asList(copyList).subList(0, copyList.length));
        int index = 0;
        for (ListItem aCopyList : copyList)
        {
            listItems.add(copyList[index]);
            index++;
        }
    }


    private void print(ArrayList<ListItem> list)
    {

        for (int i = 0; i < list.size(); i++)
        {
            ListItem current = list.get(i);
            System.out.println(i + ":" + current.getName() + ":" + current.getQuantity());
        }
    }

    private void removeItem(ArrayList<ListItem> listItems, String[] words)
    {
        try
        {
            int itemIndex = Integer.parseInt(words[1]);
            listItems.remove(itemIndex);
        } catch (Exception e)
        {
            System.out.println("Please use a number to indicate the index item to remove.");

        }
    }

    private void clear(ArrayList<ListItem> listItems)
    {
        listItems.clear();
    }

    private void sort(ArrayList<ListItem> listItems)
    {
        //Collections.sort(listItems);
    }

    private void find(ArrayList<ListItem> listItems, ListItem[] copyList)
    {
        boolean has = false;
        for (int i = 1; i < copyList.length; i++)
        {
            if (listItems.contains(copyList[i]))
            {
                System.out.println("Found the " + copyList[i]);
                has = true;
            }
        }
        if (!has)
        {
            System.out.println("No such item");
        }
    }
}
