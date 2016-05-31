package com.pharmacyandroid.services.patient;


import android.content.Context;

import com.pharmacyandroid.domain.patient.impl.PatientAddressImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface PatientAddressService
{
    void addPatientAddressImpl(Context context, PatientAddressImpl patient);
    void updatePatientAddressImpl(Context context, PatientAddressImpl patient);
}
