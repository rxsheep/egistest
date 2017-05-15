package szolkiewicz.michal.egis;

import java.util.ArrayList;
import java.util.List;

public class TechnologyArea {

	private String area;
	private List<Technology> technologyList;

	public TechnologyArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setName(String name) {
		this.area = name;
	}

	public List<Technology> getTechnologyList() {
		if(technologyList == null){
			technologyList = new ArrayList<Technology>();
		}
		return technologyList;
	}

}
