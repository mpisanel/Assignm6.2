package com.pharmacyandroid.service.prescription;

import android.content.Intent;
import android.test.AndroidTestCase;

import com.pharmacyandroid.domain.prescription.impl.PrescriptionImpl;
/**
 * Created by SONY on 2016-05-08.
 */
public class PrescriptionServiceTest extends AndroidTestCase
{
    public void setUp() throws Exception
    {
        super.setUp();

        Intent intent = new Intent(this.getContext(), PrescriptionImpl.class);
        intent.putExtra("DATE","11-April-2016");
        this.getContext().startService(intent);
    }
}
