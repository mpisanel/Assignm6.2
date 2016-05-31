package com.pharmacyandroid.services.patient;

import android.content.Context;

import com.pharmacyandroid.domain.patient.impl.PatientImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface PatientService
{
    void addPatientImpl(Context context, PatientImpl patient);
    void updatePatientImpl(Context context, PatientImpl patient);
}
