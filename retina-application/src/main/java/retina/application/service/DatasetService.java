package retina.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import retina.application.entities.Dataset;
import retina.application.repository.DatasetRepository;

@Service
@Transactional
public class DatasetService {

	@Autowired
	private DatasetRepository datasetRepository;

	public Long totalEvents() {
		return datasetRepository.count();
	}

	public void deleteDataset(Long id) {
		datasetRepository.deleteById(id);
		
	}

	public boolean existsById(Long id) {
		return datasetRepository.existsById(id);
	}

	public Dataset saveDataset(Dataset entity) {
		return datasetRepository.save(entity);
	}

	public List<Dataset> findDataset() {
		
		return datasetRepository.findAll();
	}

}
