package br.com.meetapp.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.meetapp.model.Meet;

@Named
@SessionScoped
public class MeetBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Meet meet;

	private List<Meet> meetList = new ArrayList<Meet>();

	public void addMeet() {
		meetList.add(meet);
		clear();
	}
	
	public void clear() {
		this.meet = new Meet();
	}

	public Meet getMeet() {
		return meet;
	}

	public void setMeet(Meet meet) {
		this.meet = meet;
	}

	public List<Meet> getMeetList() {
		return meetList;
	}

	public void setMeetList(List<Meet> meetList) {
		this.meetList = meetList;
	}



}
