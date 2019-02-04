package IAgency;

import IEstate.IEstate;

import java.util.ArrayList;

public interface IAgencyDB {
    void addEntry(IEstate estate);
    void removeEntry(IEstate estate);
    ArrayList<IAgencyDBEntry> getAllEntries();
}
