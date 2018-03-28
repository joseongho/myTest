package myService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface MyDiaryService {

	void writeDiary(HttpServletRequest request);

	Model selectTitleDate(Model model);
	
	Model selectNumber(Model model,HttpServletRequest request);

}