package com.nt.dao;

import java.util.List;
import java.util.Map;



public interface EmpDAO {
	
	public List<Map<String,Object>> getEmpDetails(String cond);

}
