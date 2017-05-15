package szolkiewicz.michal.egis;

import java.util.ArrayList;
import java.util.List;

public class TechnologyCollection {

	private List<TechnologyArea> technologiesByArea;

	public List<TechnologyArea> getTechnologiesByArea() {
		if (technologiesByArea == null) {
			technologiesByArea = new ArrayList<TechnologyArea>();
		}
		return technologiesByArea;
	}

}
