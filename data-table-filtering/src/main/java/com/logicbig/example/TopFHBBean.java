package com.logicbig.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class TopFHBBean {
    private List<TopFHB> topFHBList;
    private List<TopFHB> filteredTopFHBList;

    @PostConstruct
    public void postConstruct() {
    	topFHBList = ReadJSONExample.get();
    }

    public List<TopFHB> getTopFHBList() {
        return topFHBList;
    }

    public List<TopFHB> getFilteredTopFHBList() {
        return filteredTopFHBList;
    }

    public void setFilteredTopFHBList(List<TopFHB> filteredTopFHBList) {
        this.filteredTopFHBList = filteredTopFHBList;
    }

    public List<String> getDeptList(){
        return DataService.INSTANCE.getDepartments();
    }
}