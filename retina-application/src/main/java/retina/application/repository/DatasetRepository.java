package retina.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import retina.application.entities.Dataset;


@Repository
public interface DatasetRepository extends JpaRepository<Dataset, Long>{


}
