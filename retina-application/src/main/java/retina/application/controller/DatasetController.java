package retina.application.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import retina.application.dto.DatasetDto;
import retina.application.entities.Dataset;
import retina.application.service.DatasetService;
import retina.application.transformer.DatasetTransfmorer;

@RestController
@RequestMapping("/dataset")
public class DatasetController {

	@Autowired
	private DatasetService datasetService;

	@Autowired
	private DatasetTransfmorer datasetTransformer;

	@GetMapping(value = "/stats/total", produces = MediaType.APPLICATION_JSON_VALUE)
	public Long getDatasetTotal() {
		return datasetService.totalEvents();
	}

	@GetMapping(value = "/stats/offenses", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public List<Dataset> getDatasetInOrder() {

		return datasetService.findDataset().stream().sorted().collect(Collectors.toList());
		
	}

	@PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public DatasetDto postDataset(@Validated @RequestBody DatasetDto newDataset) {

		return datasetTransformer.toDto(datasetService.saveDataset(datasetTransformer.toEntity(newDataset)));
//		return datasetService.saveDataset(newDataset);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public boolean deleteDataset(@PathVariable Long id) {
		if (datasetService.existsById(id)) {
			datasetService.deleteDataset(id);
			return true;
		}
		else
		return false;

	}
}
