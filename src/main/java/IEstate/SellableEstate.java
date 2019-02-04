package IEstate;

public class SellableEstate extends IEstateDecorator{

    public SellableEstate(IEstate component) {
        super(component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " for sale";
    }
}
