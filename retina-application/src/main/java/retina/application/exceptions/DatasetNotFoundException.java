package retina.application.exceptions;

public class DatasetNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -3567262455507447557L;

	DatasetNotFoundException(Long id) {
	    super("Could not find dataset " + id);
	  }
}
