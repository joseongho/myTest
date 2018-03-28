package myService;

import java.io.UnsupportedEncodingException;
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
		try {
			request.setCharacterEncoding("UTF-8");
			myDiary.setTitle(request.getParameter("title"));
			myDiary.setContent(request.getParameter("content"));
			myDiary.setGoodThing(request.getParameter("goodThing"));
			myDiary.setBadThing(request.getParameter("badThing"));
			myDiary.setToDo(request.getParameter("toDo"));
			myDiaryDao.insertDiary(myDiary);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		try {
			request.setCharacterEncoding("utf-8");
			myDiary.setNumber(Integer.parseInt(request.getParameter("number")));
			model.addAttribute("diary", myDiaryDao.selectNumber(myDiary));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
}
