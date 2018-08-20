package badm.courts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import badm.courts.domain.GroupPlayingPracticeDTO;
import badm.courts.entity.GroupPlayingPractice;
import badm.courts.repository.GroupPlayingPracticeRepository;
import badm.courts.service.GroupPlayingPracticeService;
import badm.courts.service.utils.ObjectMapperUtils;

@Service

public class GroupPlayingPracticeServiceImpl implements GroupPlayingPracticeService{

	@Autowired
	private GroupPlayingPracticeRepository gppRepository;
	
	@Autowired
	private ObjectMapperUtils modelMapper;
	
	@Override
	public void addGPP(GroupPlayingPracticeDTO dto) {
		gppRepository.save(modelMapper.map(dto, GroupPlayingPractice.class));
	}

	@Override
	public GroupPlayingPracticeDTO getGppById(Long id) {
		return modelMapper.map(gppRepository.findById(id), GroupPlayingPracticeDTO.class);
	}

	@Override
	public List<GroupPlayingPracticeDTO> getAllGpp() {
		return modelMapper.mapAll(gppRepository.findAll(), GroupPlayingPracticeDTO.class);
	}

	@Override
	public void deleteGpp(Long id) {
		gppRepository.deleteById(id);
	}

}
