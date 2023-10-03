import java.util.*;
//Remove the Integer if user accidently giving same again..

public class B_IntegerDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want to push : ");
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
             al.add(sc.nextInt());
       }

   
    System.out.println(al); 
    // we can also iterate
    for(Integer khuchbhi : al){
        System.out.println(khuchbhi);
    }

    HashSet<Integer> set = new HashSet<Integer>(al);
    System.out.println("Having no duplicate occurance "+set);
    }
}