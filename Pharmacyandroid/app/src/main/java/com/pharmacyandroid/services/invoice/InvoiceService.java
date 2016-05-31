package com.pharmacyandroid.services.invoice;

import android.content.Context;

import com.pharmacyandroid.domain.invoice.impl.InvoiceImpl;

/**
 * Created by SONY on 2016-05-07.
 */
public interface InvoiceService
{
    void addInvoiceImpl(Context context, InvoiceImpl invoice);
    void updateInvoiceImpl(Context context, InvoiceImpl invoice);
}
