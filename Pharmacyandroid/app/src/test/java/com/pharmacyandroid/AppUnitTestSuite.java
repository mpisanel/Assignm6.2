package com.pharmacyandroid;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.pharmacyandroid.factories.aternativecontactt.AlternativeContactTest;
import com.pharmacyandroid.factories.aternativecontactt.AlternativeContactAddressTest;
import com.pharmacyandroid.factories.doctort.DoctorTest;
import com.pharmacyandroid.factories.doctort.DoctorAddressTest;
import com.pharmacyandroid.factories.invoicet.InvoiceTest;
import com.pharmacyandroid.factories.patientt.PatientTest;
import com.pharmacyandroid.factories.patientt.PatientAddressTest;
import com.pharmacyandroid.factories.pharmacyt.PharmacyTest;
import com.pharmacyandroid.factories.pharmacyt.PharmacyAddressTest;
import com.pharmacyandroid.factories.prescriptiont.PrescriptionTest;
/**
 * Created by SONY on 2016-04-16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AlternativeContactTest.class,
        AlternativeContactAddressTest.class,
        DoctorTest.class,
        DoctorAddressTest.class,
        InvoiceTest.class,
        PatientTest.class,
        PatientAddressTest.class,
        PharmacyTest.class,
        PharmacyAddressTest.class,
        PrescriptionTest.class})
public class AppUnitTestSuite {}
