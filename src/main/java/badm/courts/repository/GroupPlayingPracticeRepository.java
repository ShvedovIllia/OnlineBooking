package badm.courts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import badm.courts.entity.GroupPlayingPractice;

@Repository

public interface GroupPlayingPracticeRepository
		extends JpaRepository<GroupPlayingPractice, Long>, JpaSpecificationExecutor<GroupPlayingPractice> {

}
