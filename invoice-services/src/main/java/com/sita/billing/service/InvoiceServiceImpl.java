package com.sita.billing.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Predicate;
import org.springframework.data.jpa.domain.Specification;
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
	
	@Override
	public List<InvoiceBean> retrieveEmployees(InvoiceBean filter){
		
		List<InvoiceBean> invoices = invoiceDao.findAll(new Specification<InvoiceBean>() {

			@Override
			public javax.persistence.criteria.Predicate toPredicate(Root<InvoiceBean> root, CriteriaQuery< ?> query, CriteriaBuilder cb) {

				List<javax.persistence.criteria.Predicate> predicates = new ArrayList<>();

				//File Name	
				if (filter.getFileName() != null && !("").equals(filter.getFileName())) {
					predicates.add(cb.equal(root.get("fileName"), filter.getFileName().trim()));
				}
				
				//Activity Month
				if (filter.getActivityMonth() != null && !("").equals(filter.getActivityMonth())) {
					predicates.add(cb.equal(root.get("activityMonth"), filter.getActivityMonth().trim()));
				}

				//Activity Year
				if (filter.getActivityYear() != null && !("").equals(filter.getActivityYear())) {
					predicates.add(cb.equal(root.get("activityYear"), filter.getActivityYear().trim()));
				}
				
				//Report Name
				if (filter.getReportName() != null && !("").equals(filter.getReportName())) {
					predicates.add(cb.like(cb.lower(root.get("reportName")), 
                                                    "%" + filter.getReportName().toLowerCase().trim() + "%"));
				}
				
				//Numeric Code
				if (filter.getNcc() != null && !("").equals(filter.getNcc())) {
					predicates.add(cb.equal(root.get("ncc"), filter.getNcc().trim()));
				}

				return cb.and(predicates.toArray(new javax.persistence.criteria.Predicate[0]));
			}
		});
	return invoices;
	}
	
}
