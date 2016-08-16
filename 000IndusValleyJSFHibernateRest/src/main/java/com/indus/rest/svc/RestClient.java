package com.indus.rest.svc;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.indus.model.Department;

@Service("restSvc")
public class RestClient {

	public Department getDepartmentDetails(Integer deptId) {

		Department deptObj = null;
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://192.168.1.19:9010/11IndusGlasfishJerseySpringHibernate/")
				.path("departmentsvc").path("{deptId}").resolveTemplate("deptId", deptId)
				.request(MediaType.APPLICATION_JSON).get();
		deptObj = response.readEntity(Department.class);
		return deptObj;

	}

}
