package ca.uxplore.json.mapping.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ca.uxplore.json.mapping.holiday.HolidayApiClientTemp;

public class statusTest3 {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		HolidayApiClientTemp client = new HolidayApiClientTemp("32256183-b02a-41d9-9b0a-53d63d8b49e9");
		@SuppressWarnings("unused")
		Object holidayJson = client.getHolidays("PK", 2018,12,-1);
		assertEquals(402,client.getHolidayJson2().getStatus());
	}

}
