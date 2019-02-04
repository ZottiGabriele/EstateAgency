package IAgency;

import IClient.IClient;
import IEstate.IEstate;
import IEstate.SellableEstate;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Predicate;

public interface IAgency {

    float getAvaragePriceMatching(Predicate<IAgencyDBEntry> predicate);
    ArrayList<SellableEstate> getEstatesMatching(Predicate<IAgencyDBEntry> predicate);
    void bookVisit(IEstate targetEstate, Date bookingDate, IClient bookingClient);
    void addEstateToAgency(IEstate newEstate);
}
