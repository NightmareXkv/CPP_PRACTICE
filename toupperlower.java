import java.util.*;
public class toupperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String s = "cavarbvSVBSVSEVvcaevVCEDVE";

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            sb.append(Character.toUpperCase(x));

        }

        for (int i = 0; i < sb.length(); i++) {
            System.err.print(sb.charAt(i));
        }

        

    }
}
