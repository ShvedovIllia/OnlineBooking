package badm.courts.service;

import java.util.List;

import badm.courts.domain.CostDTO;

public interface CostService {

	void createCost(CostDTO costDTO);

	CostDTO getCostById(Long id);

	List<CostDTO> getAllCosts();

	void updateCostById(Long id);

	void deleteCostById(Long id);
}
