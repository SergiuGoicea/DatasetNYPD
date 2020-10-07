package retina.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import retina.application.service.DatasetService;

@RestController
@RequestMapping("/dataset")
public class DatasetController {

	@Autowired
	private DatasetService datasetService;

	@GetMapping(value = "/stats/total", produces = MediaType.APPLICATION_JSON_VALUE)
	public Long getDatasetTotal() {
		return datasetService.totalEvents();
	}

	@DeleteMapping("/dataset/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteDataset(@PathVariable Long id) {
		if (datasetService.existsById(id))

			datasetService.deleteDataset(id);

	}
}
