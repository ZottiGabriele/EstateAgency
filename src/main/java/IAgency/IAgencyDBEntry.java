package IAgency;

import IClient.IClient;
import IEstate.IEstate;

import java.time.LocalDate;

public interface IAgencyDBEntry {
    IEstate getAssociatedEstate();
    boolean checkAvailability(LocalDate targetDate);
    void bookForDate(LocalDate targetDate, IClient client);
}
