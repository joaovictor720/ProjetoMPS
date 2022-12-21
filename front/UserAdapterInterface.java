public abstract class UserAdapterInterface {
    private User user;

    public UserAdapterInterface(){}

    public UserAdapterInterface(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    //public abstract User convertJSON();
}