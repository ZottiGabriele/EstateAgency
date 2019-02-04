package IEstate;

import java.time.LocalDate;

public abstract class IEstateDecorator implements IEstate{

    IEstate component;

    public IEstateDecorator(IEstate component) {
        this.component = component;
    }

    @Override
    public float getPrice() {
        return component.getPrice();
    }

    @Override
    public int getYearsSinceConstruction() {
        return component.getYearsSinceConstruction();
    }

    @Override
    public LocalDate getLastRenovation() {
        return component.getLastRenovation();
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }

    @Override
    public String getAddress() {
        return component.getAddress();
    }
}
