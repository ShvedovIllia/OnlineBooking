package badm.courts.service;

import java.util.List;

import badm.courts.domain.WaterDTO;
import badm.courts.domain.filter.SimpleFilter;

public interface WaterService {

	void addItem(WaterDTO waterDTO);

	List<WaterDTO> getAllWater();

	void deleteWaterById(Long id);
	
	WaterDTO getWaterById(Long id);

	List<WaterDTO> findWaterByTitle(SimpleFilter filter);
}
