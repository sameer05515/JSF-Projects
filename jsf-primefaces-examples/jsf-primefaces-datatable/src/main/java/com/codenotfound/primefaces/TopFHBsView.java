package com.codenotfound.primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class TopFHBsView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private TopFHBRepository topFHBRepository;

	private List<TopFHB> topFHBs;

	private List<TopFHB> filteredTopFHBs=new ArrayList<TopFHB>();

	@PostConstruct
	public void init() {
		topFHBs = topFHBRepository.findAll();
	}

	public List<TopFHB> getTopFHBs() {
		return topFHBs;
	}

	public List<TopFHB> getFilteredTopFHBs() {
		return filteredTopFHBs;
	}

	public void setFilteredTopFHBs(List<TopFHB> filteredTopFHBs) {
		this.filteredTopFHBs = filteredTopFHBs;
	}
}
