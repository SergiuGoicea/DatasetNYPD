package retina.application.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import retina.application.dto.DatasetDto;

@Component
public class DatasetValidator implements ConstraintValidator<DatasetValidation, DatasetDto> {

	@Override
	public boolean isValid(DatasetDto value, ConstraintValidatorContext context) {
		boolean isValid = true;

		int ky_cd = value.getKy_cd();
		if (ky_cd > 999) {
			context.buildConstraintViolationWithTemplate(String.format("The number is invalid."))
					.addConstraintViolation();
			return false;
		}
		return isValid;
	}

}
