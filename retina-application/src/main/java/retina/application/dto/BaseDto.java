package retina.application.dto;

import java.io.Serializable;

public abstract class BaseDto implements Serializable {

	private static final long serialVersionUID = 5951010218922987637L;
	
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
