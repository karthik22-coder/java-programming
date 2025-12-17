package looping;
public class L28 {
    public static void main(String[] args) {
        System.out.print("Vowels: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.print(ch + " ");
        }

        System.out.print("\nConsonants: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))
                System.out.print(ch + " ");
        }
    }
}
