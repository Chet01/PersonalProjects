import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {
        String str = "i love you madam";
        String[] st = str.split(" ");
        System.out.println(Arrays.toString(st));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < st.length; i++) {
            StringBuilder builder = new StringBuilder(st[i]);
            StringBuilder rev = new StringBuilder(builder).reverse();
            System.out.println(builder);
            System.out.println(rev);

            if (!builder.toString().equals(rev.toString())) {
                list.add(st[i]);
            }
        }

        System.out.println(list);
        for(String s:list) {
        	System.out.print(s+" ");
        }
    }
}
