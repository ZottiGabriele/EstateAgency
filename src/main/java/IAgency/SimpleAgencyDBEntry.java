package IAgency;

import IClient.IClient;
import IEstate.IEstate;

import java.time.LocalDate;

public class SimpleAgencyDBEntry implements IAgencyDBEntry {

    private IEstate associatedEstate;

    public SimpleAgencyDBEntry(IEstate associatedEstate) {
        this.associatedEstate = associatedEstate;
    }

    @Override
    public IEstate getAssociatedEstate() {
        return this.associatedEstate;
    }

    @Override
    public boolean checkAvailability(LocalDate targetDate) {
        return false;
    }

    @Override
    public void bookForDate(LocalDate targetDate, IClient client) {

    }
}
