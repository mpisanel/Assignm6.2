package com.pharmacyandroid.services.pharmacy;

import android.content.Context;

import com.pharmacyandroid.domain.pharmacy.impl.PharmacyImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface PharmacyService
{
    void addPharmacyImpl(Context context, PharmacyImpl pharmacy);
    void updatePharmacyImpl(Context context, PharmacyImpl pharmacy);
}
