package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList();
	private static int idCounter =0 ;
	
	static {
		todos.add(new Todo(++idCounter, "in28minutes", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn about microservices ", new Date(), false));
		todos.add(new Todo(++idCounter, "in28minutes", "Learn about angular", new Date(), false));
		todos.add(new Todo(++idCounter, "in28minutes", "visit Cameroon", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) { //it's a create
			todo.setId(++idCounter);
			todos.add(todo);
		}else {
			this.deteleById(todo.getId());
			todos.add(todo);
			
		}
		
		return todo;
	}

	public Todo deteleById(long id) { 
		Todo todo = findById(id);
		if(todo==null) return null;
		
		if(todos.remove(todo)) {;
			return todo;
		}
		return null;
		
	}

	public Todo findById(long id) {
		for(Todo todo:todos) {
			if(todo.getId()==id) {
				return todo;
			}
		}
		return null;
	}
	
	
}
