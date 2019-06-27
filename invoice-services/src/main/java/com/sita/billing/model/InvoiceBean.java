package com.sita.billing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BILLING_BILLINGFILES")
public class InvoiceBean {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BILLING_ID_SEQ")
    @SequenceGenerator(sequenceName = "billing_seq", allocationSize = 1, name = "BILLING_ID_SEQ")
	@Column(name="RECORD_ID")
	private long recordId;
	
	@Column(name="FILE_NAME")
	private String fileName;
	
	@Column(name="ACTIVITY_MONTH")
	private String activityMonth;
	
	@Column(name="ACTIVITY_YEAR")
	private String activityYear;
	
	@Column(name="REPORT_CODE")
	private String reportCode;
	
	@Column(name="REPORT_CATEGORY")
	private String reportCategory;
	
	@Column(name="REPORTNAME")
	private String reportName;
	
	@Column(name="NUMERICCODE")
	private String ncc;
	
	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getActivityMonth() {
		return activityMonth;
	}

	public void setActivityMonth(String activityMonth) {
		this.activityMonth = activityMonth;
	}

	public String getActivityYear() {
		return activityYear;
	}

	public void setActivityYear(String activityYear) {
		this.activityYear = activityYear;
	}

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public String getReportCategory() {
		return reportCategory;
	}

	public void setReportCategory(String reportCategory) {
		this.reportCategory = reportCategory;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getNcc() {
		return ncc;
	}

	public void setNcc(String ncc) {
		this.ncc = ncc;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	private String directory;
}
