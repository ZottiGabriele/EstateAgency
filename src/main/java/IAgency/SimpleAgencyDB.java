package IAgency;

import IEstate.IEstate;

import java.util.ArrayList;

public class SimpleAgencyDB implements IAgencyDB {

    ArrayList<IAgencyDBEntry> entries = new ArrayList<IAgencyDBEntry>();

    @Override
    public void addEntry(IEstate estate) {
        IAgencyDBEntry entry = new SimpleAgencyDBEntry(estate);
        entries.add(entry);
    }

    @Override
    public ArrayList<IAgencyDBEntry> getAllEntries() {
        return entries;
    }

    @Override
    public void removeEntry(IEstate estate) {

    }
}
