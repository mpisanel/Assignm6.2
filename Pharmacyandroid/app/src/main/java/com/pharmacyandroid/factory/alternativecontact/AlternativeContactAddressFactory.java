package com.pharmacyandroid.factory.alternativecontact;
import com.pharmacyandroid.domain.alternativecontact.impl.AlternativeContactAddressImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class AlternativeContactAddressFactory
{
    public static AlternativeContactAddressImpl getAlternativeAddress(String aStreet, String aSuburb, String aPostCode)
    {
        AlternativeContactAddressImpl myAlternAddress = new AlternativeContactAddressImpl.Builder()
                .bStreet(aStreet)
                .bSuburb(aSuburb)
                .bPostCode(aPostCode)
                .build();
        return myAlternAddress;
    }
}
