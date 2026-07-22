package br.gov.es.pmo.obligation_core.model;
import java.util.List;
public interface IObligationProvider {
 List<Long> getYears();
 List<ObligationManagementUnitDto> getManagementUnits(Long year);
 List<ObligationDto> getObligations(Long year, ObligationManagementUnitDto managementUnit);
 ObligationDto getObligation(String processId, String managementUnitCode);
}
