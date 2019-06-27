package com.sita.billing.service;

import java.util.List;

import com.sita.billing.model.InvoiceBean;

public interface InvoiceService {
	
	public List<InvoiceBean> getInvoiceByNcc(String ncc);
	public List<InvoiceBean> getInvoiceList();

}
