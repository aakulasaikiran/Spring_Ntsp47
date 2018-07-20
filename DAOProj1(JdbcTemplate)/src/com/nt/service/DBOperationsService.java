package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DBOperationsService {
 public String registerEmp(int eno,String name,String desg,int salary);
 public int showSalary(int eno);
 public String hikeSalary(int eno,float percentage);
 public  Map<String,Object>getEmpDetails(int eno);
 public List<Map<String,Object>> getAllEmpDetails(int eno);
 public String  fireEmp(int empno);
 
}
