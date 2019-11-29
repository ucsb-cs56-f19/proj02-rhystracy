package earthquakes.osm;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Place{
	private static Logger logger = LoggerFactory.getLogger(Place.class);

	public long place_id;
	public double lat;
	public double lon;
	public String display_name;
	public String type;

	/**
	 * Create a Place object from json representation
	 *
	 * @param json String of json returned by API endpoint {@code /classes/search}
	 * @return a new FeatureCollection object
	 * @see <a href=
	 * "https://tools.ietf.org/html/rfc7946">https://tools.ietf.org/html/rfc7946</a>
	 **/

	public static List<Place> listFromJson(String json){
		try {
			ObjectMapper mapper = new ObjectMapper();
			List<Place> myObjects = mapper.readValue(json, new TypeReference<List<Place>>(){});
			return myObjects;
		} catch (JsonProcessingException jpe) {
			logger.error("JsonProcessingException:" + jpe);
			
			return null;
		} catch (Exception e) {
			logger.error("Exception:" + e);
			return null;
		}
	}
}
