package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException { // execute this code only when place id is null
		// write a code that will give you place id

		StepDefination sd = new StepDefination();
		if (StepDefination.place_id == null) {
			sd.add_Place_Payload_with("Uma Shanker", "English", "Asia");
			sd.user_calls_with_http_request("AddPlaceAPI", "POST");
			sd.verify_place_Id_created_maps_to_using("Uma Shanker", "getPlaceAPI");
		}
	}
}
