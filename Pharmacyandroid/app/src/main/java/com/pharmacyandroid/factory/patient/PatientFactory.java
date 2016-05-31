package com.pharmacyandroid.factory.patient;
import com.pharmacyandroid.domain.patient.impl.PatientImpl;
/**
 * Created by SONY on 2016-04-15.
 */
public class PatientFactory
{
    public static PatientImpl getPatient(String pName, String mID, String mName )
    {
        PatientImpl myPat = new PatientImpl.Builder()
                .bPatName(pName)
                .bMedID(mID)
                .bMedName(mName)
                .build();
        return myPat;
    }
}
