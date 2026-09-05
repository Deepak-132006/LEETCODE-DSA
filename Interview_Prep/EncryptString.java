package Interview_Prep;

import java.util.Scanner;

public class EncryptString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.print("Enter the Encrypt range: ");
        int k = sc.nextInt();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char result = (char) (str.charAt(i) + k);
            res.append(result);
        }
        System.out.println(res);
        sc.close();
    }
}
