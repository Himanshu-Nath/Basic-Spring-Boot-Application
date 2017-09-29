package com.example.demo.controller;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


@Entity
@Table(name = "mdl_ctx_lab")
public class Lab implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "BIGINT")
	private long id;
	
	@Column(name = "lab_src_id", nullable = false, length = 64)
	private String labSrcId;
	
	@Column(name = "lab_nm", nullable = false, length = 512)
	private String labName;
	
	@Column(name = "lab_desc", nullable = true, columnDefinition = "VARCHAR(MAX)")
	private String labDesc;
	
	@Column(name = "active_ind", nullable = false, columnDefinition = "TINYINT")
	private byte activeInd;
	
	@Column(name = "timecreated", nullable = false, columnDefinition = "BIGINT")
	private long timecreated;
	
	@Column(name = "timemodified", nullable = false, columnDefinition = "BIGINT")
	private long timemodified;
	
	
	public Lab() {}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the labSrcId
	 */
	public String getLabSrcId() {
		return labSrcId;
	}

	/**
	 * @param labSrcId the labSrcId to set
	 */
	public void setLabSrcId(String labSrcId) {
		this.labSrcId = labSrcId;
	}

	/**
	 * @return the labName
	 */
	public String getLabName() {
		return labName;
	}

	/**
	 * @param labName the labName to set
	 */
	public void setLabName(String labName) {
		this.labName = labName;
	}

	/**
	 * @return the labDesc
	 */
	public String getLabDesc() {
		return labDesc;
	}

	/**
	 * @param labDesc the labDesc to set
	 */
	public void setLabDesc(String labDesc) {
		this.labDesc = labDesc;
	}

	/**
	 * @return the activeInd
	 */
	public byte getActiveInd() {
		return activeInd;
	}

	/**
	 * @param activeInd the activeInd to set
	 */
	public void setActiveInd(byte activeInd) {
		this.activeInd = activeInd;
	}

	/**
	 * @return the timecreated
	 */
	public long getTimecreated() {
		return timecreated;
	}

	/**
	 * @param timecreated the timecreated to set
	 */
	public void setTimecreated(long timecreated) {
		this.timecreated = timecreated;
	}

	/**
	 * @return the timemodified
	 */
	public long getTimemodified() {
		return timemodified;
	}

	/**
	 * @param timemodified the timemodified to set
	 */
	public void setTimemodified(long timemodified) {
		this.timemodified = timemodified;
	}
	
}
