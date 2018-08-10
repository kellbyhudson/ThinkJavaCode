public class StringUtil
{
    public static String getFirstCharacter(String test)
    {
        char c;

        c = test.charAt(0);

        String s = Character.toString(c);

        return s;
    }

    public static String getLastCharacter(String test)
    {
        char c;

        c = test.charAt(test.length() - 1);

        String s = Character.toString(c);

        return s;
    }

    public static String getFirstTwoCharacters(String test)
    {
        String s;

        s = test.substring(0, 2);

        return s;
    }

    public static String getLastTwoCharacters(String test)
    {
        String s;

        s = test.substring(test.length() - 2);

        return s;
    }

    public static String getAllButFirstThreeCharacters(String test)
    {
        String s;

        s = test.substring(3, test.length());

        return s;
    }

    public static void printCharacters(String test)
    {
        for (int i = 0; i < test.length(); i++)
        {
            System.out.println(test.charAt(i) + " : " + i);
        }
    }

    public static void printPhoneNumber(String test)
    {
        String area;
        String ex;
        String line;
        boolean hyphen = false;

        for (int i = 0; i < test.length(); i++)
        {
            if (test.charAt(i) == '-')
            {
                hyphen = true;
            }
            if (test.charAt(i) == 'A' || test.charAt(i) == 'B' || test.charAt(i) == 'C')
            {
                test = test.replace(test.charAt(i), '2');
            }
            if (test.charAt(i) == 'D' || test.charAt(i) == 'E' || test.charAt(i) == 'F')
            {
                test = test.replace(test.charAt(i), '3');
            }
            if (test.charAt(i) == 'G' || test.charAt(i) == 'H' || test.charAt(i) == 'I')
            {
                test = test.replace(test.charAt(i), '4');
            }
            if (test.charAt(i) == 'J' || test.charAt(i) == 'K' || test.charAt(i) == 'L')
            {
                test = test.replace(test.charAt(i), '5');
            }
            if (test.charAt(i) == 'M' || test.charAt(i) == 'N' || test.charAt(i) == 'O')
            {
                test = test.replace(test.charAt(i), '6');
            }
            if (test.charAt(i) == 'P' || test.charAt(i) == 'Q' || test.charAt(i) == 'R' || test.charAt(i) == 'S')
            {
                test = test.replace(test.charAt(i), '7');
            }
            if (test.charAt(i) == 'T' || test.charAt(i) == 'U' || test.charAt(i) == 'V')
            {
                test = test.replace(test.charAt(i), '8');
            }
            if (test.charAt(i) == 'W' || test.charAt(i) == 'X' || test.charAt(i) == 'Y' || test.charAt(i) == 'Z')
            {
                test = test.replace(test.charAt(i), '9');
            }
        }
        if (hyphen)
        {
            area = test.substring(0, test.indexOf('-'));
            ex = test.substring(test.indexOf('-') + 1, test.lastIndexOf('-'));
            line = test.substring(test.lastIndexOf('-') + 1, test.length());
        }
        else
        {
            area = test.substring(0, 3);
            ex = test.substring(3, 6);
            line = test.substring(6, 10);
        }

        System.out.println("Area Code: " + area + "\tExchange: " + ex + "\tLine Number: " + line);
    }

    public static int findFirstE(String test)
    {
        int e = 0;
        boolean first = true;

        for (int i = 0; i < test.length(); i++)
        {
            if (first)
            {
                if (test.charAt(i) == 'e')
                {
                    e = i;
                    first = false;
                }
            }
        }

        return e;
    }

    public static boolean isFinn(String test)
    {
        boolean is = false;

        if (test.equals("Finn"))
        {
            is = true;
        }

        return is;
    }

    public static String reverse(String s)
    {
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--)
        {
            result = result + s.charAt(i);
        }

        return result;
    }

    public static boolean isPalindrome(String s)
    {
        boolean answer = false;
        int index = 0;
        String front = "";
        String back = "";

        for (int i = 0; i < s.length() / 2; i++)
        {
            if (i == 0)
            {
                front = s.substring(i, i + 1);
                front = front.toLowerCase();
                //System.out.println(front);
                back = s.substring(s.length() - 1);
                back = back.toLowerCase();
                //System.out.println(back);
            }
            else
            {
                front = s.substring(i, i + 1);
                front = front.toLowerCase();
                //System.out.println(front);
                back = s.substring(s.length() - 1 - i, s.length() - i);
                back = back.toLowerCase();
                //System.out.println(back);
            }

            if (front.equals(back))
            {
                answer = true;
            }
            else
            {
                answer = false;
                return answer;
            }

        }

        return answer;
    }

    public static boolean allLetters(String[] words)
    {
        boolean learn = false;
        String test;
        int countL = 0, countE = 0, countA = 0, countR = 0, countN = 0;

        for (int i = 0; i < words.length; i++)
        {
            test = words[i].toUpperCase();
            if (test.startsWith("L"))
            {
                countL++;
            }
            if (test.startsWith("E"))
            {
                countE++;
            }
            if (test.startsWith("A"))
            {
                countA++;
            }
            if (test.startsWith("R"))
            {
                countR++;
            }
            if (test.startsWith("N"))
            {
                countN++;
            }
        }
        if (countL + countE + countA + countR + countN >= 5)
        {
            learn = true;
        }

        return learn;
    }

    public static boolean allLettersNoDupes(String[] words)
    {
        boolean answer = false;
        int countL = 0, countE = 0, countA = 0, countR = 0, countN = 0;
        String test;

        for (int i = 0; i < words.length; i++)
        {
            test = words[i].toUpperCase();
            if (test.startsWith("L"))
            {
                countL++;
            }
            if (test.startsWith("E"))
            {
                countE++;
            }
            if (test.startsWith("A"))
            {
                countA++;
            }
            if (test.startsWith("R"))
            {
                countR++;
            }
            if (test.startsWith("N"))
            {
                countN++;
            }
        }

        if (countL == 1 && countE == 1 && countA == 1 && countR == 1 && countN == 1)
        {
            answer = true;
        }

        return answer;
    }

    public static boolean sameCount(String[] words)
    {
        boolean answer = false;
        int index = 0;
        int store = 0;
        int[] s = new int[words.length];
        String[] copy = new String[words.length];
        copy = words;

        for (int j = 0; j < words.length; j++)
        {
            for (int i = 1; i < words.length; i++)
            {
                if (words[i].contains(copy[index]))
                {
                    s[index]++;
                }
            }
            index++;
        }
        for (int i = 0; i < s.length; i++)
        {
            if (s[i] % 2 == 0)
            {
                answer = true;
            }
            //System.out.println(s[i]);
        }

        return answer;
    }

    public static String[] sort(String[] s)
    {
        String maxEnd = "";
        int max = 0;
        int min = 0;
        String minFront = "";
        int index;
        int backIndex = s.length;
        int frontIndex = 0;

        for (int j = 0; j < s.length; j++)
        {

            for (int i = frontIndex + 1; i < backIndex; i++)
            {
                if (s[i - 1].compareTo(s[i]) > max)
                {
                    index = i - 1;
                    maxEnd = s[index];
                    s[index] = s[i];
                    s[i] = maxEnd;
                }
            }

            for (int i = backIndex - 2; i > frontIndex; i--)
            {
                if (s[i + 1].compareTo(s[i]) < min)
                {
                    index = i + 1;
                    minFront = s[index];
                    s[index] = s[i];
                    s[i] = minFront;
                }
            }
        }

        for (int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        return s;
    }

    public static void main(String[] args)
    {
        System.out.println(getFirstCharacter("Hello"));
        System.out.println(getFirstCharacter("Goodbye"));

        System.out.println(getLastCharacter("Hello"));
        System.out.println(getLastCharacter("Goodbye"));

        System.out.println(getFirstTwoCharacters("Hello"));
        System.out.println(getFirstTwoCharacters("Goodbye"));

        System.out.println(getLastTwoCharacters("Hello"));
        System.out.println(getLastTwoCharacters("Goodbye"));

        System.out.println(getAllButFirstThreeCharacters("Hello"));
        System.out.println(getAllButFirstThreeCharacters("Goodbye"));

        printCharacters("Hello");

        printPhoneNumber("501-555-0100");

        System.out.println(findFirstE("Hello"));
        System.out.println(findFirstE("Goodbye"));

        System.out.println(isFinn("Finn"));
        System.out.println(isFinn("Jake"));

        printPhoneNumber("5015550100");
        printPhoneNumber("KELLBYHUDS");

        System.out.println(reverse("Finn"));

        System.out.println(isPalindrome("Hannah"));
        System.out.println(isPalindrome("Kellby"));

        String[] words = {"leap", "earn", "near", "real", "answer", "leer", "nice"};
        String[] otherWords = {"leap", "make", "near", "real", "answer"};
        String[] exactWords = {"leap", "earn", "near", "real", "answer"};


        System.out.println(allLetters(words));
        System.out.println(allLetters(otherWords));

        System.out.println(allLettersNoDupes(exactWords));
        System.out.println(allLettersNoDupes(words));
        System.out.println(allLettersNoDupes(otherWords));

        String[] trek1 = {"Spock", "Kirk", "Spock", "Kirk"};
        String[] trek2 = {"Spock", "Spock", "Kirk"};
        String[] trek3 = {"Spock", "Spock", "Kirk", "Kirk"};


        System.out.println(sameCount(trek1));
        System.out.println(sameCount(trek2));
        System.out.println(sameCount(trek3));

        String[] animals = {"Zebra", "Ant", "Car", "Boat", "Alien", "Aardvark", "Giraffe", "Owl", "Earth"};

        sort(animals);
    }
}
