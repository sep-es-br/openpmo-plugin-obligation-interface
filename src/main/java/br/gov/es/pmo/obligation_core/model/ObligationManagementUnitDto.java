package br.gov.es.pmo.obligation_core.model;
public class ObligationManagementUnitDto {
 private String code; private String name;
 public ObligationManagementUnitDto() {}
 public ObligationManagementUnitDto(String code,String name){this.code=code;this.name=name;}
 public String getCode(){return code;} public void setCode(String v){code=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
}
