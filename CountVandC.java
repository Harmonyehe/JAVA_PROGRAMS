import java.util.*;
public class CountVandC {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String str=sc.nextLine();

        str=str.toLowerCase();
        int vowels=0,consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else if(ch>='a'&& ch<='z'){
                consonants++;
            }
        }
    System.out.println("Vowels: "+vowels);
    System.out.println("Consonants: "+consonants);
    sc.close();
    }
    
}
