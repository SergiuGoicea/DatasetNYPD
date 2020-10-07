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

	public List<Dataset> findDatasets() {
		return datasetRepository.findAll();
	}
}
