package szolkiewicz.michal.egis;

import com.google.gson.Gson;

public class TechnologyParser {

	private static final String url = "https://github.com/egis/handbook/blob/master/Tech-Stack.md"; 
	private Gson gson = new Gson();
	
	public String getTechnologyFromUrl(){
		TechnologyCollectionFactory technologyCollectionFactory = new TechnologyCollectionFactoryUrlImpl(url);
		return gson.toJson(technologyCollectionFactory.buildTechnology());  
	}
}
