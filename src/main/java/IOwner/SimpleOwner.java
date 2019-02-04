package IOwner;

public class SimpleOwner implements IOwner {

    String fullName;

    public SimpleOwner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getOwnerFullName() {
        return this.fullName;
    }
}
