package Dictionaries;
import java.util.*;
import java.io.*;
public class DictionariesAndMap {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> phoneBook = new HashMap<String, String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
