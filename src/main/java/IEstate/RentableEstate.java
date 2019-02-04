package IEstate;

import IOwner.IOwner;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class RentableEstate extends IEstateDecorator {

    private IOwner owner;

    public RentableEstate(IEstate component, IOwner owner) {
        super(component);
        this.owner = owner;
    }

    IOwner getOwner() {
        return this.owner;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " owned by " + owner.getOwnerFullName() + " for rent";
    }
}
