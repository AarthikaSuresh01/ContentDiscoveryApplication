package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ContentEntity;
import com.example.demo.service.ContentService;

@RestController
public class ContentController {
	@Autowired
	ContentService cs;
	@PostMapping("addcontent")
	public ContentEntity add(@RequestBody ContentEntity ce) {
		long id=ce.getId();
		String title=ce.getTitle();
		String detail=ce.getDetail();
		return cs.saveInfo(new ContentEntity(id,title,detail));
	}
	@GetMapping("showcontent")
	public List<ContentEntity>display(){;
	
return cs.showinfo();
}
}
