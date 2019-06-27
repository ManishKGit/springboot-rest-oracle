package com.sita.billing.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sita.billing.model.InvoiceBean;
import com.sita.billing.repository.InvoiceDAO;

@Service
public class InvoiceServiceImpl implements InvoiceService{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	InvoiceDAO invoiceDao;

	@Override
	public List<InvoiceBean> getInvoiceByNcc(String ncc) {
		// TODO Auto-generated method stub
		return invoiceDao.findByNcc(ncc);
	}
	
	@Override
	public List<InvoiceBean> getInvoiceList() {
		// TODO Auto-generated method stub
		return invoiceDao.findAll();
	}
	
}
