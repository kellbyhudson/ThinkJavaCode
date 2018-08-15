import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class PetHotel
{
    private TreeMap<Integer, ArrayList<String>> hotelMap = new TreeMap<Integer, ArrayList<String>>();
    private ArrayList<String> room = new ArrayList<>();


    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();
        petHotel.run();
    }

    private void run()
    {
        boolean exit = false;

        do
        {
            Scanner in = new Scanner(System.in);
            String commandLine;
            System.out.println("Enter one of the following:");
            System.out.println("CheckIn <petName> <roomNumber>");
            System.out.println("CheckOut <roomNumber>");
            System.out.println("Move <fromRoomNumber> <toRoomNumber>");
            System.out.println("Swap <firstRoomNumber> <secondRoomNumber>");
            System.out.println("MoveDown");
            System.out.println("MoveUp");
            System.out.println("Occupancy");
            System.out.println("Rooms");
            System.out.println("CloseForSeason");
            System.out.println("Exit");

            commandLine = in.nextLine();
            String[] words = commandLine.split(" ");
            String command = words[0];
            command = command.toUpperCase();
            int roomNumber;

            //emptyMap();

            try
            {
                switch (command)
                {
                    case "OCCUPANCY":
                        occupancy();
                        System.out.println("Occu\n");
                        break;
                    case "ROOMS":
                        rooms();
                        System.out.println("rooms\n");
                        break;
                    case "CLOSEFORSEASON":
                        closeForSeason();
                        System.out.println("close\n");
                        break;
                    case "MOVEUP":
                        moveup();
                        System.out.println("moveup\n");
                        break;
                    case "MOVEDOWN":
                        movedown();
                        System.out.println("movedown\n");
                        break;
                    case "EXIT":
                        exit = true;
                        System.out.println("exit\n");
                        break;
                    case "CHECKOUT":
                        roomNumber = Integer.parseInt(words[1]);
                        if (words.length == 3)
                        {
                            String petStay = words[2];
                            checkout(roomNumber, petStay);
                        }
                        else
                        {
                            checkOut(roomNumber);
                        }
                        System.out.println("checkout\n");
                        break;
                    case "CHECKIN":
                        roomNumber = Integer.parseInt(words[2]);
                        if (hotelMap.containsKey(roomNumber))
                        {
                            System.out.println(hotelMap.get(roomNumber).size());
                            if (hotelMap.get(roomNumber).size() < 4)
                            {
                                checkIn(words[1], roomNumber);
                                System.out.println("checkin\n");
                            }
                            else
                            {
                                System.out.println("Room Full\n");
                            }
                        }
                        else
                        {
                            checkIn(words[1], roomNumber);
                            System.out.println("checkin\n");
                        }
                        break;
                    case "MOVE":
                        int fromRoom = Integer.parseInt(words[1]);
                        int toRoom = Integer.parseInt(words[2]);
                        move(fromRoom, toRoom);
                        System.out.println("move\n");
                        break;
                    case "SWAP":
                        int firstRoom = Integer.parseInt(words[1]);
                        int secondRoom = Integer.parseInt(words[2]);
                        swap(firstRoom, secondRoom);
                        System.out.println("swap\n");
                        break;
                    default:
                        System.out.println("Invalid command, try again\n");
                        break;
                }
            } catch (Exception e)
            {
                System.out.println("Caught--Invalid command, try again\n");
            }
        } while (!exit);
    }

    /*private void emptyMap()
    {
        for (int i = 100; i < 110; i++)
        {
            hotelMap.put(i, "Empty Room");
        }
    }*/
    private void checkIn(String petName, int roomNumber)
    {
        if (roomNumber > 99 && roomNumber < 110)
        {

            if (!hotelMap.containsKey(roomNumber))
            {
                ArrayList<String> newRoom = new ArrayList<>();
                newRoom.add(petName);
                hotelMap.put(roomNumber, newRoom);
            }
            else
            {
                room = hotelMap.get(roomNumber);
                room.add(petName);
                hotelMap.put(roomNumber, room);
            }
        }
    }

    private void checkOut(int roomNumber)
    {
        hotelMap.remove(roomNumber);
    }

    private void checkout(int roomNumber, String petStay)
    {
        room = hotelMap.get(roomNumber);
        room.clear();
        room.add(petStay);
        hotelMap.put(roomNumber, room);
    }

    private void move(int fromRoom, int toRoom)
    {
        if (hotelMap.containsKey(toRoom))
        {
            System.out.println("Occupied Room");
        }
        else
        {
            hotelMap.put(toRoom, hotelMap.get(fromRoom));
            hotelMap.remove(fromRoom);
        }
    }

    private void occupancy()
    {
        System.out.println(hotelMap.entrySet());
    }

    private void rooms()
    {
        for (int i = 100; i < 110; i++)
        {
            if (hotelMap.containsKey(i))
            {
                System.out.println("Room " + i + ": " + hotelMap.get(i));
            }
            else
            {
                System.out.println("Room " + i + ":");
            }
        }

    }

    private void closeForSeason()
    {
        hotelMap.clear();
    }

    private void swap(int firstRoom, int secondRoom)
    {
        ArrayList<String> temp;
        temp = hotelMap.get(firstRoom);

        hotelMap.put(firstRoom, hotelMap.get(secondRoom));
        hotelMap.put(secondRoom, temp);
    }

    private void moveup()
    {
        boolean last = false;
        int key = 109;
        ArrayList<String> value = room;
        if (hotelMap.containsKey(key))
        {
            value = hotelMap.get(key);
            hotelMap.remove(key);
            last = true;
        }

        for (int i = 109; i > 99; i--)
        {
            if (hotelMap.containsKey(i))
            {
                hotelMap.put(i + 1, hotelMap.get(i));
                hotelMap.remove(i);
            }
        }
        if (last)
        {
            hotelMap.put(100, value);
        }
    }

    private void movedown()
    {
        boolean last = false;
        int key = 100;
        ArrayList<String> value = room;
        if (hotelMap.containsKey(key))
        {
            value = hotelMap.get(key);
            hotelMap.remove(key);
            last = true;
        }

        for (int i = 101; i < 110; i++)
        {
            if (hotelMap.containsKey(i))
            {
                hotelMap.put(i - 1, hotelMap.get(i));
                hotelMap.remove(i);
            }
        }
        if (last)
        {
            hotelMap.put(109, value);
        }

    }
}

