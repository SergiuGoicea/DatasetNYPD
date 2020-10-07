package retina.applicatiton.transformer;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import retina.application.dto.DatasetDto;
import retina.application.entities.Dataset;
import retina.application.repository.DatasetRepository;

@Component
public class DatasetTransfmorer extends AbstractTransformer<Dataset, DatasetDto>{

	@Autowired
	private DatasetRepository datasetrepository;
	
	@Override
	public DatasetDto toDto(Dataset entity) {
		DatasetDto dto= new DatasetDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	@Override
	public Dataset toEntity(DatasetDto dto) {
		Dataset entity = findOrCreateNew(dto.getId());
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	@Override
	protected Dataset findOrCreateNew(Long id) {
		return id== null? new Dataset() : datasetrepository.findById(id).orElseGet(Dataset::new);
	}

}
