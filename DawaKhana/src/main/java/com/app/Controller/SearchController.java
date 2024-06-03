package com.app.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.SearchService;

@RestController
@RequestMapping("/search")
@CrossOrigin(origins="http://localhost:3000")
public class SearchController {

    private SearchService srcSrv;

}
