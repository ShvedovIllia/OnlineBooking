package badm.courts.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import badm.courts.domain.WaterDTO;
import badm.courts.domain.filter.SimpleFilter;
import badm.courts.service.WaterService;

@Service

public class WaterServiceImpl implements WaterService {

	@Override
	public void addItem(WaterDTO waterDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<WaterDTO> getAllWater() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteWaterById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateWaterById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<WaterDTO> findWaterByTitle(SimpleFilter filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
