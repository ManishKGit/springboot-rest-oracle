package com.sita.billing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.sita.billing.model.InvoiceBean;

@Repository
public interface InvoiceDAO extends JpaRepository<InvoiceBean, Long>,JpaSpecificationExecutor<InvoiceBean> {
	public List<InvoiceBean> findByNcc(String ncc);
}
