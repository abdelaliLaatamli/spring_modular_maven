package my.app.invoicing.service;

import my.app.invoicing.models.Invoice;
import my.app.invoicing.service.impl.InvoiceServiceImpl;

import java.util.List;

public interface InvoiceService {

    List<Invoice> getAllInvoces();

    static InvoiceService build(){
        return new InvoiceServiceImpl();
    }
}
