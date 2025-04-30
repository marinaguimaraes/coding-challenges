package prepare.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for(int i=0;i<n;i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext())
        {
            String name = in.nextLine();
            String output = getPhoneNumber(phoneBook, name);
            System.out.println(output);
        }

        in.close();
    }

    private static String getPhoneNumber(Map<String, Integer> phoneBook, String name) {
        Integer phoneNumber = phoneBook.get(name);
        return phoneNumber == null ? "Not found" : name +"="+phoneNumber;
    }

}
