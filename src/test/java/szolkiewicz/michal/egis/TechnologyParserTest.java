package szolkiewicz.michal.egis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TechnologyParserTest {

	private TechnologyParser technologyParser;

	@Before
	public void before() throws Exception{
		technologyParser = new TechnologyParser();
	}
	
	@Test
	public void testUrlParse() throws Exception{
		String json = technologyParser.getTechnologyFromUrl();
		System.out.println(json);
		Assert.assertNotNull(json);
	}
}
