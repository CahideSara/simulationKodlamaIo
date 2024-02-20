package simulationKodlamaIo.business;


import java.util.ArrayList;
import java.util.List;

import simulationKodlamaIo.core.logging.Logger;
import simulationKodlamaIo.dataAccess.CourseDao;
import simulationKodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao _courseDao;
	private Logger[] loggers;
	
    private List<String> courseNameList = new ArrayList<>();
    private List<String> categoryNameList = new ArrayList<>();

	public CourseManager(CourseDao _courseDao, Logger[] loggers) {
		this._courseDao = _courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		if(courseNameList.contains(course.getName())){
			throw new Exception("Bu isimde kurs mevcuttur");
		}
		else if(categoryNameList.contains(course.getCategory())){
			throw new Exception("Bu isimde kategori mevcuttur");
		}
		else if(course.getUnitPrice()<0){
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		
		_courseDao.add(course);
		for(Logger logger:loggers) {
			logger.log(course.getName());
		}
		
	}

}
