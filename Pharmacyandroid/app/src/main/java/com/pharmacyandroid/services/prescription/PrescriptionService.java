package com.pharmacyandroid.services.prescription;

import android.content.Context;

import com.pharmacyandroid.domain.prescription.impl.PrescriptionImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface PrescriptionService
{
    void addPrescriptionImpl(Context context, PrescriptionImpl prescription);
    void updatePrescriptionImpl(Context context, PrescriptionImpl prescription);
}
