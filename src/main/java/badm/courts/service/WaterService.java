package badm.courts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import badm.courts.domain.WaterDTO;
import badm.courts.domain.filter.SimpleFilter;

@Service

public interface WaterService {

	void addItem(WaterDTO waterDTO);
	
	List<WaterDTO> getAllWater();
	
	void deleteWaterById(Long id);
	
	void updateWaterById(Long id);
	
	List<WaterDTO> findWaterByTitle(SimpleFilter filter);
}
