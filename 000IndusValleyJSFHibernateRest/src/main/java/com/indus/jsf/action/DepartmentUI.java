package com.indus.jsf.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.beans.factory.annotation.Autowired;

import com.indus.model.Department;
import com.indus.rest.svc.RestClient;

@ManagedBean(name="department")
public class DepartmentUI {
	
	@ManagedProperty(value="#{restSvc}")
	private RestClient restClientObj;
	
	
	private Integer deptNo;
	private Department dept;
	
	
	public RestClient getRestClientObj() {
		return restClientObj;
	}
	public void setRestClientObj(RestClient restClientObj) {
		this.restClientObj = restClientObj;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
 
		public String getDepartment() {
		
		 dept=restClientObj.getDepartmentDetails(deptNo);

        return "success";
        
	    }
		public Integer getDeptNo() {
			return deptNo;
		}
		public void setDeptNo(Integer deptNo) {
			this.deptNo = deptNo;
		}
	
	

}
