package pe.swagger.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {



	private static final Logger LOGGER = Logger.getLogger(DemoController.class);

	@PostMapping("/session/create-session-data")
	public String createSessionData(@RequestHeader("SESSION") String sessionId) throws Exception {
		LOGGER.info("Inicia [add Session data]");
		LOGGER.info("Header authorization [" + sessionId + "]");
		long timeStart = System.nanoTime();
		try {

			LOGGER.info("ResponseBody [" + timeStart + "]");
			return "response";
		} catch (Exception e) {
			LOGGER.error(e);
		} finally {
			long timeResponse = System.nanoTime();
			LOGGER.info("Termina [add session data]");
		}
		return "holas";

	}

}
