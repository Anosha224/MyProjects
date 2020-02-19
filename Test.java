import java.util.Scanner;

public class Test {
    public static void main(String[] args)throws Exception {
        AutoCompleteDictionaryTrie trieDictionary=new AutoCompleteDictionaryTrie();
        Filing file=new Filing();
        file.dict();

        for (String i : file.Dictionary){
            trieDictionary.addWord(i);
        }
        String ab = "a";

        while(ab != "z"){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Urdu word to find or Enter z to exit");
            ab = sc.nextLine();
            trieDictionary.FetchAll(ab);
        }
           }
}
