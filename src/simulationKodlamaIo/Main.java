package simulationKodlamaIo;
 
import simulationKodlamaIo.business.CourseManager;
import simulationKodlamaIo.core.logging.*;
import simulationKodlamaIo.dataAccess.*;
import simulationKodlamaIo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		 Course course=new Course(1,"Java","Sıfırdan java",0,"Programlama","Engin Demiroğ");
		 
		 Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		 
		 CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
		 courseManager.add(course);
	}

}
