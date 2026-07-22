package br.gov.es.pmo.obligation_core.model;
public class ObligationDto {
 private String processId; private String processNumber; private String managementUnitCode; private String managementUnitName;
 private Long year; private String description; private String supplierCnpj; private String amount; private String protocol;
 public String getProcessId(){return processId;} public void setProcessId(String v){processId=v;}
 public String getProcessNumber(){return processNumber;} public void setProcessNumber(String v){processNumber=v;}
 public String getManagementUnitCode(){return managementUnitCode;} public void setManagementUnitCode(String v){managementUnitCode=v;}
 public String getManagementUnitName(){return managementUnitName;} public void setManagementUnitName(String v){managementUnitName=v;}
 public Long getYear(){return year;} public void setYear(Long v){year=v;}
 public String getDescription(){return description;} public void setDescription(String v){description=v;}
 public String getSupplierCnpj(){return supplierCnpj;} public void setSupplierCnpj(String v){supplierCnpj=v;}
 public String getAmount(){return amount;} public void setAmount(String v){amount=v;}
 public String getProtocol(){return protocol;} public void setProtocol(String v){protocol=v;}
}
