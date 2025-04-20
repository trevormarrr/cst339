package cst339.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst339.business.UserBusinessService;
import cst339.model.UserModel;

@RestController
@RequestMapping("/service")
public class UsersRestService {

	@Autowired
	UserBusinessService userBusinessService;

	@GetMapping(path = "/users")
	public ResponseEntity<?> getUsers() {
		try {
			List<UserModel> users = userBusinessService.getAllUsers();
			if (users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else {
				return new ResponseEntity<>(users, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
