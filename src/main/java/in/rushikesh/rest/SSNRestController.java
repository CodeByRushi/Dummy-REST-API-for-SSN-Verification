package in.rushikesh.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSNRestController {

	@GetMapping("ssn/{ssn}")
	public String getStateName(@PathVariable String ssn) {
		if (ssn == null || ssn.isEmpty()) {
			return "InvalidSSN";
		}
		if (ssn.charAt(0) == '1')
			return "Ohio";
		if (ssn.charAt(0) == '2')
			return "Alaska";
		if (ssn.charAt(0) == '3')
			return "California";
		if (ssn.charAt(0) == '4')
			return "Florida";
		if (ssn.charAt(0) == '5')
			return " Iowa";
		if (ssn.charAt(0) == '6')
			return "New Jersey";

		return "New York";
	}
}
