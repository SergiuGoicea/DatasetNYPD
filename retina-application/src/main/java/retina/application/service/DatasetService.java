package retina.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import retina.application.repository.DatasetRepository;

@Service
@Transactional
public class DatasetService {

	@Autowired
	private DatasetRepository datasetRepository;
}
