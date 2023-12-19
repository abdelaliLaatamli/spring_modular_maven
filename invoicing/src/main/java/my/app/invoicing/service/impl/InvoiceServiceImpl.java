package my.app.invoicing.service.impl;

import my.app.invoicing.models.Invoice;
import my.app.invoicing.service.InvoiceService;

import java.util.List;

public class InvoiceServiceImpl implements InvoiceService  {
    @Override
    public List<Invoice> getAllInvoces() {
        return List.of( new Invoice("abcdef") );
    }
}
