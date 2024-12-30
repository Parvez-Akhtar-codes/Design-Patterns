package BuilderDesignPatternExample2;

public class User {
    private String username;
    private String userId;
    private String userEmail;

    @Override
    public String toString() {
        return this.username + " : "+this.userId + " : "+this.userEmail;
    }

    private User(UserBuilder builder){
        this.userId = builder.userId;
        this.username = builder.username;
        this.userEmail = builder.userEmail;
    }
    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    static class UserBuilder{
        private String username;
        private String userId;
        private String userEmail;
        public UserBuilder(){

        }

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;

        }
        public User Build(){
            User user = new User(this);
            return user;
        }
    }
}
