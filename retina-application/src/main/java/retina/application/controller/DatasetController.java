package retina.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
