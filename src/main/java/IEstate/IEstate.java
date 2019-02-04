package IEstate;

import java.time.LocalDate;

public interface IEstate {
    float getPrice();
    int getYearsSinceConstruction();
    LocalDate getLastRenovation();
    String getDescription();
    String getAddress();
}
