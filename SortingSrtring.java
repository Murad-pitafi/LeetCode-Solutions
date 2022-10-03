public class SortingSrtring {
    public static void Sortingstring(String abc)
    {
        char[] c = abc.toCharArray();
        char temp;
        for (int i = 0; i < abc.length(); i++) {

            for (int j = 0; j < abc.length()-i-1; j++)
            {
                if (c[j]> c[j+1])
                {
                    temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        for (int i = 0; i <c.length; i++)
        {
            System.out.print(c[i] + "");
        }
    }

    public static void main(String[] args) {
        Sortingstring("hello");
    }
}
