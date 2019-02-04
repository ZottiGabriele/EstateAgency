package IEstate.BaseClasses;

import IEstate.IEstate;
import java.time.LocalDate;

public class Apartament implements IEstate {

    private final float listPrice;
    private final float minimumSellingPrice;
    private final LocalDate dateOfConstruction;
    private final String address;
    private final String descrition = "Apartment";

    public Apartament(float listPrice, float minimumSellingPrice, LocalDate dateOfConstruction, String address) {
        this.listPrice = listPrice;
        this.minimumSellingPrice = minimumSellingPrice;
        this.dateOfConstruction = dateOfConstruction;
        this.address = address;
    }

    public float getPrice() {
        return this.listPrice;
    }

    public int getYearsSinceConstruction() {
        int out = LocalDate.now().getYear() - this.dateOfConstruction.getYear();
        return out;
    }

    public LocalDate getLastRenovation() {
        return this.dateOfConstruction;
    }

    public String getDescription() {
        return this.descrition;
    }

    public String getAddress() {
        return this.address;
    }
}
