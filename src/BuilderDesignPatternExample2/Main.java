package BuilderDesignPatternExample2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setUserId("123")
                .setUserEmail("jndtak342@gmail.com")
                .setUsername("jnd")
                .Build();
        System.out.println(user1);
    }
}
