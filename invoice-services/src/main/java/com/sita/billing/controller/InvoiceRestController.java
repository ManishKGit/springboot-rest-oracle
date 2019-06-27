package com.sita.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sita.billing.model.InvoiceBean;
import com.sita.billing.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {

	@Autowired
	private InvoiceService invoiceService;
	
	@RequestMapping("/all")
	public List<InvoiceBean> getInvoiceList(){
		return invoiceService.getInvoiceList();
	}
	
	@RequestMapping("/ncc")
	public List<InvoiceBean> getInvoiceByNcc(@RequestParam String ncc){
		return invoiceService.getInvoiceByNcc(ncc);
	}
}
