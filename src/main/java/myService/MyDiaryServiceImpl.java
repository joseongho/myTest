package myService;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import myDao.MyDiaryDao;
import myModel.MyDiary;

@Service
public class MyDiaryServiceImpl implements MyDiaryService {
	@Inject
	MyDiary myDiary;
	@Inject
	MyDiaryDao myDiaryDao;

	@Override
	public void writeDiary(HttpServletRequest request) {
		myDiary.setTitle(request.getParameter("title"));
		myDiary.setContent(request.getParameter("content"));
		myDiary.setGoodthing(request.getParameter("goodthing"));
		myDiary.setBadthing(request.getParameter("badthing"));
		myDiary.setTodo(request.getParameter("todo"));
		myDiaryDao.insertDiary(myDiary);

	}

	@Override
	public Model selectTitleDate(Model model) {
		List<MyDiary> list = myDiaryDao.selectTitleDate();
		model.addAttribute("list", list);
		return model;
	}

	@Override
	public Model selectNumber(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub

		myDiary.setNumber(Integer.parseInt(request.getParameter("number")));
		model.addAttribute("diary", myDiaryDao.selectNumber(myDiary));

		return model;
	}
}
