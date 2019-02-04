package IEstate;

import IEstate.BaseClasses.Apartament;
import IEstate.BaseClasses.Villa;
import IOwner.IOwner;

import java.time.LocalDate;

public class IEstateBuilder {

    IEstate component = null;

    public IEstateBuilder getEstate(EstateType type, float listPrice, float minimumSellingPrice, LocalDate dateOfConstruction, String address) {
        switch (type) {
            case apartment:
                component = new Apartament(listPrice, minimumSellingPrice, dateOfConstruction, address);
                break;
            case villa:
                component = new Villa(listPrice, minimumSellingPrice, dateOfConstruction, address);
                break;
        }
        return this;
    }

    public SellableEstate buildAsSellable() {
        SellableEstate out = new SellableEstate(component);
        component = null;
        return out;
    }

    public RentableEstate buildAsRentable(IOwner owner) {
        RentableEstate out = new RentableEstate(component, owner);
        component = null;
        return out;
    }

}
