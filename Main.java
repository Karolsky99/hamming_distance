import java.util.*;
public class Main {
    static int hamming_distance (String string1, String string2) {
        int ctr = 0;
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != string2.charAt(i)) {
                    ctr++;
                }
            }
            return ctr;
        } else {
            return -1; // method will return -1 if strings length is not equal
        }
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first DNA sequence");
        String dna1 = scan.nextLine();
        System.out.println("Enter second DNA sequence");
        String dna2 = scan.nextLine();
        int distance = hamming_distance(dna1, dna2);
        if (distance != -1) {
            System.out.println("Hamming distance = " + distance);
        } else {
            System.out.println("ERROR - strings length is not equal!");
        }
        scan.close();
    }
}
