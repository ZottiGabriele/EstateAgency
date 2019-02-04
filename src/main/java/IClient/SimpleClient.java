package IClient;

public class SimpleClient implements IClient{

    private String fullName;

    public SimpleClient(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getClientFullName() {
        return this.fullName;
    }
}
