package tn.app.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.app.model.User;


@ManagedBean(name="auth")
@SessionScoped
public class AuthCtrl {
	
	private User user;
	private User selectedUser;
	private List<User> users;

	public AuthCtrl() {
	}

	public User getUser() {
		if(user == null)
			user = new User();
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		if(users == null)
			users = new ArrayList<User>();
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	public String addUser(){
		User toAdd = new User(user.getId(), user.getName(), user.getEmail());
		users.add(toAdd);
		return "";
	}
	
	public String removeUser(){
		users.remove(selectedUser);
		return "";
	}
	
	
	
	
	

}
