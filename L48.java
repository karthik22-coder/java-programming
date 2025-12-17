package looping;
import java.util.Scanner;
class L48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"Zero","One","Two","Three","Four",
                          "Five","Six","Seven","Eight","Nine"};
        int n = sc.nextInt();
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++)
            System.out.println(words[s.charAt(i) - '0']);
    }
}
