import IAgency.IAgency;
import IEstate.BaseClasses.Apartament;
import IEstate.*;
import IOwner.*;
import IAgency.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class EstateAgencyTests {

    public static void main(String[] args) {
        IEstateBuilder estateBuilder = new IEstateBuilder();
        IOwner owner = new SimpleOwner("Pippo Baudo");
        IEstate asd = estateBuilder.getEstate(EstateType.apartment,  1234, 0, LocalDate.of(1975, 12, 5), "Via Stocazzo, 2")
                .buildAsRentable(owner);
        IEstate asd2 = estateBuilder.getEstate(EstateType.villa,  531451, 0, LocalDate.of(2011, 12, 5), "Via StoGranCazzo, 2")
                .buildAsSellable();
        IEstate asd3 = estateBuilder.getEstate(EstateType.villa,  1010, 0, LocalDate.of(2011, 12, 5), "Via AUSnfiaj, 2")
                .buildAsSellable();
        IAgency myAgency = new SimpleAgency();
        myAgency.addEstateToAgency(asd);
        myAgency.addEstateToAgency(asd2);
        myAgency.addEstateToAgency(asd3);
        for(IEstate lala : myAgency.getEstatesMatching(x -> x.getAssociatedEstate().getPrice() < 20000)) {
            System.out.println(lala);
        }
    }
}
