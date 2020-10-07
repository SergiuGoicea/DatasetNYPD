package retina.application.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import retina.application.entities.Dataset;
import retina.application.repository.DatasetRepository;

@Component
public class DatasetValidator implements ConstraintValidator<DatasetValidation, Dataset> {

	@Autowired
	private DatasetRepository datasetRepository;

	@Override
	public boolean isValid(Dataset value, ConstraintValidatorContext context) {
		boolean isValid = !datasetRepository.existsById(value.getId());

		if (!isValid) {
			context.buildConstraintViolationWithTemplate(String.format("The id=%s does not exist.", value.getId()))
					.addPropertyNode("id").addConstraintViolation();
			return false;
		}

		return isValid;
	}

}
