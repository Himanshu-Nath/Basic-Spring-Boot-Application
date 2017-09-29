package com.example.demo.controller;

import java.io.Serializable;

public class LabBean implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private Long id;
		private String labSrcId;
		private String labName;
		private String labDesc;
		private Byte activeInd;
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
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
		public Byte getActiveInd() {
			return activeInd;
		}
		/**
		 * @param activeInd the activeInd to set
		 */
		public void setActiveInd(Byte activeInd) {
			this.activeInd = activeInd;
		}
}
