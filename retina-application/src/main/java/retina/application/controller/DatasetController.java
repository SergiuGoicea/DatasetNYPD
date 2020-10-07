package retina.application.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import retina.application.entities.Dataset;
import retina.application.service.DatasetService;

@RestController
@RequestMapping("/dataset")
public class DatasetController {

	@Autowired
	private DatasetService datasetService;
	
	@GetMapping(value="/stats/total", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Dataset> getDatasetTotal(){
		return datasetService.findDatasets().stream().map().collect(Collectors.toList());
	}
}
