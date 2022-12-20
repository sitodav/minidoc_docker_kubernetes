package sito.dskij;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controll
{
	@GetMapping("/hello")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<>("Hello WOrld", HttpStatus.OK);
	}
}
