package Org.Bhavya.Infosys.HRApplication.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import Org.Bhavya.Infosys.HRApplication.Model.ErrorMessage;
//@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {


	@Override
	public Response toResponse(Throwable exception) {
		ErrorMessage em = new ErrorMessage(exception.getMessage(), 500, "Org.Bhavya.Infosys.HRApplication");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(em).build();
	}
}
