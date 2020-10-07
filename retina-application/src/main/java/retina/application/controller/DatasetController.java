package retina.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import retina.application.dto.DatasetDto;
import retina.application.entities.Dataset;
import retina.application.service.DatasetService;
import retina.applicatiton.transformer.DatasetTransfmorer;

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
//	  @GetMapping("/stats/total")
//	  Dataset one(@PathVariable Long id) {
//
//	    return datasetRepository.findById(id)
//	      .orElseThrow(() -> new DatasetNotFoundException(id));
//	  }

	@PutMapping(value = "/dataset/stats/offenses", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public Dataset postDataset(@RequestBody DatasetDto newDataset) {

		return datasetService.saveDataset(datasetTransformer.toEntity(newDataset));
//		return datasetService.saveDataset(newDataset);
	}

	@DeleteMapping("/dataset/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDataset(@PathVariable Long id) {
		if (datasetService.existsById(id))
			
			datasetService.deleteDataset(id);

	}
}
