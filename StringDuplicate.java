import java.util.*;
//Remove the string if user accidently giving same string again..

public class StringDuplicate {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
             al.add(sc.next());
       }

   
    System.out.println(al); 
    // we can also iterate
    for(String khuchbhi : al){
        System.out.println(khuchbhi);
    }

    HashSet<String> set = new HashSet<String>(al);
    System.out.println("String having no duplicate occurance "+set);
    }
}