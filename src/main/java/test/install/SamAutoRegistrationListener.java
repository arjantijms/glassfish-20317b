package test.install;

import javax.security.auth.message.config.AuthConfigFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SamAutoRegistrationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// Register the factory-factory-factory for the SAM
		AuthConfigFactory.getFactory().registerConfigProvider(
			new TestAuthConfigProvider(),
			"HttpServlet", null, "Test authentication config provider B"
		);

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}
}