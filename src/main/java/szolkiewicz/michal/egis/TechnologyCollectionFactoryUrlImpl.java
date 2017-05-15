package szolkiewicz.michal.egis;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TechnologyCollectionFactoryUrlImpl implements TechnologyCollectionFactory {

	private final String url;

	public TechnologyCollectionFactoryUrlImpl(String url) {
		this.url = url;
	}

	public TechnologyCollection buildTechnology() {
		TechnologyCollection technologyCollection = new TechnologyCollection();
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			Element content = doc.getElementById("readme");
			Elements sections = content.getElementsByTag("h2");
			sections.stream().forEach(s -> {
				TechnologyArea techArea = new TechnologyArea(s.text());
				s.nextElementSibling().getElementsByTag("tr").stream().forEach(row -> {
					List<Element> columns = row.getElementsByTag("td");
					if (columns.size() >= 4) {
						techArea.getTechnologyList().add(new Technology(columns.get(0).text(), columns.get(1).text(),
								columns.get(2).text(), columns.get(3).text()));
					} else if (columns.size() == 3) {
						techArea.getTechnologyList().add(
								new Technology(columns.get(0).text(), columns.get(1).text(), columns.get(2).text()));
					} else if (columns.size() == 2) {
						techArea.getTechnologyList().add(new Technology(columns.get(0).text(), columns.get(1).text()));
					}
				});
				technologyCollection.getTechnologiesByArea().add(techArea);
			});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return technologyCollection;
	}

}
