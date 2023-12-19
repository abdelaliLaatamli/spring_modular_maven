package org.modularity.controllers;

import my.app.invoicing.models.Invoice;
import my.app.invoicing.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/invoicing")
    private ResponseEntity<List<Invoice>> getInvoices(){
        InvoiceService service = InvoiceService.build();
        return ResponseEntity.ok(service.getAllInvoces());
    }

}
