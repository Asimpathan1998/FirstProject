package JavaTutorial;

public class HashCodeExample {
    public static void main(String args[]){
        String str1 = "Hello";
        String str2 = "Hello";

        // will generate same hash code
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        
    }
}
