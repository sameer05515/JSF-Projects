package org.test.jsf.practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
//@ViewScoped
@SessionScoped
public class CarsView implements Serializable {

  private static final long serialVersionUID = 1L;

//  @Inject
//  private CarRepository carRepository;

  private List<Car> cars;

  @PostConstruct
  public void init() {
    cars = new ArrayList<Car>();
    cars.add(new Car(1L, "Maruti", 1950, "Black"));
    cars.add(new Car(2L, "BMW", 1980, "Black"));
  }

  public List<Car> getCars() {
    return cars;
  }
}
