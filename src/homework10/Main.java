package homework10;

public class Main {
    public static void main(String[]args){
        getUser();
    }
    public static void getUser(){
        User user1 = new User(1,"alex","12345");
        User user2 = new User(1,"alex","12345");
        User user3 = new User(2,"bob","55555");
        User user4 = new User(2,"bob","44444");
        getEquals(user1,user2);
        getEquals(user1,user3);
        getEquals(user3,user4);
    }
    
    public static void getEquals(User user1,User user2){
        System.out.println("-".repeat(50));
        System.out.println(user1+"\n"+user2);
        System.out.println("-".repeat(30));
        System.out.println("HachCode users:\n"+user1.hashCode()+"\n"+user2.hashCode());
        System.out.println("-".repeat(30));
        System.out.println("user1==user2?");
        System.out.println(user1==user2);
        System.out.println("user1.equals(user2)?");
        System.out.println(user1.equals(user2));
    }
}
