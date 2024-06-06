package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.SearchService;

@RestController
@RequestMapping("/search")
@CrossOrigin(origins="http://localhost:3000")
public class SearchController {
    
    @Autowired
    private SearchService srcSrv;

    @GetMapping("/search")
	public ResponseEntity<?> search(@RequestParam(name = "query") String query) {
		System.out.println("in the search controller");
		System.out.println(query);
		try {
			// Assuming mediService is an instance of a service class that handles the
			// search logic
			return ResponseEntity.ok(srcSrv.searchKeyword(query));
		} catch (Exception e) {
			e.printStackTrace();
			String errorMessage = "An error occurred while processing your request: " + e.getMessage();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
		}
	}


}
