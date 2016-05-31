package com.pharmacyandroid.services.pharmacy;

import android.content.Context;

import com.pharmacyandroid.domain.pharmacy.impl.PharmacyAddressImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface PharmacyAddressService
{
    void addPharmacyAddressImpl(Context context, PharmacyAddressImpl pharmacyAddress);
    void updatePharmacyAddressImpl(Context context, PharmacyAddressImpl pharmacyAddress);
}
