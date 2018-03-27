package myService;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

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
}
