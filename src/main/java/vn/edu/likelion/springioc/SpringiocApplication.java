package vn.edu.likelion.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import vn.edu.likelion.springioc.controller.AuthenController;
import vn.edu.likelion.springioc.repo.Repo;
import vn.edu.likelion.springioc.service.MyService;

@SpringBootApplication
public class SpringiocApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringiocApplication.class, args);

		MyService myService = context.getBean(MyService.class);
		myService.performAction();


		// goi bean ControllerSMS tu IoC Container
		AuthenController controllerSMS = context.getBean(AuthenController.class);
		controllerSMS.print();

		// goi bean RepoSMS tu IoC Container'
		Repo repoSMS = context.getBean(Repo.class);
		repoSMS.print("Java");
	}

}
