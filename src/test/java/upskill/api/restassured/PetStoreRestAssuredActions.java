package upskill.api.restassured;


import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.io.File;

public class PetStoreRestAssuredActions {
	
	
	public void createPet() {
		
		given().
			body( new File(System.getProperty("user.dir")
				+"/src/test/resource/ApiRequestPayLoads/CreatePetRequest.json")).
		when().
			header("Content-Type","application/json").
			header("Username", "upskill").
			header("password", "123").
			post("htt[s.//petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiResponseSchemas/CreatePetResponse.json")));
	}
	
		public void getPet() {
		
		given().
		when().
			header("Content-Type","application/json").
			header("Username", "upskill").
			header("password", "123").
			get("htt[s.//petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiResponseSchemas/GetPetResponse.json")));
		
	}
	
	public void updatePet() {
		
		given().
		body( new File(System.getProperty("user.dir")
			+"/src/test/resource/ApiRequestPayLoads/UpdatePetRequest.json")).
	when().
		header("Content-Type","application/json").
		header("Username", "upskill").
		header("password", "123").
		put("htt[s.//petstore.swagger.io/v2/pet").
	then().
		log().body().
	and().
		assertThat().statusCode(200).
	and().
		body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiResponseSchemas/UpdatePetResponse.json")));
	}
	
	
	public void deletePet() {
		
		given().
		when().
			header("Content-Type","application/json").
			header("Username", "upskill").
			header("password", "123").
			delete("htt[s.//petstore.swagger.io/v2/pet").
		then().
			log().body().
		and().
			assertThat().statusCode(200).
		and().
			body(matchesJsonSchema(new File(System.getProperty("user.dir") + "/src/test/resource/ApiResponseSchemas/DeletePetResponse.json")));
	}
	
}
