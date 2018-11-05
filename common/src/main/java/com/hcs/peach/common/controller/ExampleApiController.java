package com.hcs.peach.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hcs.peach.common.model.Example;
import com.hcs.peach.common.repository.ExampleRepository;

@Controller
public class ExampleApiController {

	@Autowired
	private ExampleRepository exampleRep;

	@ResponseBody
	@PostMapping("/api/peach/example/list")
	public String exampleTest(Model model) {
		System.out.println("成功触发");
		Iterable<Example> iterable = exampleRep.findAll();
		System.out.println(iterable!=null);
		return JSON.toJSONString(iterable);
	}

}
