package com.logicbig.example;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity(name = "t_top_five_hundred")
public class TopFHB {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String commonname;

	private int rank;

	private long worth;

	private String citizenship;

	private String industry;

	public TopFHB() {
		super();
	}

	public TopFHB(Long id, String commonname, int rank, long worth, String citizenship, String industry) {
		super();
		this.id = id;
		this.commonname = commonname;
		this.rank = rank;
		this.worth = worth;
		this.citizenship = citizenship;
		this.industry = industry;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommonname() {
		return commonname;
	}

	public void setCommonname(String commonname) {
		this.commonname = commonname;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public long getWorth() {
		return worth;
	}

	public void setWorth(long worth) {
		this.worth = worth;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
