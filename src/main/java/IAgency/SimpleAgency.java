package IAgency;

import IClient.IClient;
import IEstate.IEstate;
import IEstate.SellableEstate;
import IEstate.RentableEstate;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class SimpleAgency implements IAgency {

    private IAgencyDB sellableDatabase;
    private IAgencyDB rentableDatabase;

    public SimpleAgency() {
        sellableDatabase = new SimpleAgencyDB();
        rentableDatabase = new SimpleAgencyDB();
    }

    @Override
    public float getAvaragePriceMatching(Predicate<IAgencyDBEntry> predicate) {
         ArrayList<IAgencyDBEntry> matches = sellableDatabase.getAllEntries().stream()
                 .filter(predicate)
                 .collect(Collectors.toCollection(ArrayList::new));
         float out = 0;
         for(IAgencyDBEntry e : matches) {
             out += e.getAssociatedEstate().getPrice();
         }
         out /= matches.size();
        return out;
    }

    @Override
    public ArrayList<SellableEstate> getEstatesMatching(Predicate<IAgencyDBEntry> predicate) {
        ArrayList<IAgencyDBEntry> matches = sellableDatabase.getAllEntries().stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<SellableEstate> out = new ArrayList<SellableEstate>();
        for(IAgencyDBEntry e : matches) {
            out.add((SellableEstate)e.getAssociatedEstate());
        }

        return out;
    }

    @Override
    public void bookVisit(IEstate targetEstate, Date bookingDate, IClient bookingClient) {

    }

    @Override
    public void addEstateToAgency(IEstate newEstate) {
        if(newEstate instanceof SellableEstate) {
            sellableDatabase.addEntry(newEstate);
        } else if (newEstate instanceof RentableEstate) {
            rentableDatabase.addEntry(newEstate);
        } else {
            System.out.println("Dafaq");
        }
    }
}
