package ChainOfResponsibilityPattern;

import java.util.logging.Level;

public abstract class Handler {

	private Handler nextHandler;

	@SuppressWarnings("unlikely-arg-type")
	public final Response hanleMessage(Request request) {

		Response response = null;

		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			if(this.nextHandler != null) {
				response = this.nextHandler.hanleMessage(request);
			}else {
				
			}
		}
		return response;
	}

	public void setNext(Handler _handler) {
		this.nextHandler = _handler;
	}

	protected abstract Level getHandlerLevel();

	protected abstract Response echo(Request request);
}
