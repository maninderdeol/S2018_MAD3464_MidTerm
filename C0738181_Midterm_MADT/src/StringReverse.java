

public class StringReverse {

    public static String reverse(String input) {
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--)
        {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}
