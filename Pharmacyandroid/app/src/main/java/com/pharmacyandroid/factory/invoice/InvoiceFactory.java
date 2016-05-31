package com.pharmacyandroid.factory.invoice;
import com.pharmacyandroid.domain.invoice.impl.InvoiceImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class InvoiceFactory
{
   public static InvoiceImpl getInvoice( String invoDetails, String invoDate)
   {
       InvoiceImpl myInvo= new InvoiceImpl.Builder()
               .bDetails(invoDetails)
               .bCurrentDate(invoDate)
               .build();
       return myInvo;
   }
}
