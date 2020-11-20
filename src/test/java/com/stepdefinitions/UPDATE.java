package com.stepdefinitions;

import org.json.JSONObject;

import com.globalClasses.ApiPaths;
import com.globalClasses.ApiTools;
import com.globalClasses.BasicSecurityUtil;
import com.globalClasses.MyTools;
import com.globalClasses.RandomTools;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UPDATE {
	
	private BasicSecurityUtil base;
	public UPDATE(BasicSecurityUtil base) {
		this.base = base;
	}
	
	RandomTools random = new RandomTools();
	MyTools myTools = new MyTools();
	String letters, stat, techString;
	JSONObject obj = new JSONObject();
	int statusCodeRetrieved;
	boolean active = true;
	
	
	// I D  - - V A  L U E S
	
	@Given("I have an ID to update a course")
	public void i_have_an_ID_to_update_a_course() {
		obj.put("id", "5e94c03d2b23de190a809651");
	}
	
	@Given("I get an id as capital letters for update")
	public void i_get_an_id_as_capital_letters_for_update() {
		obj.put("id", "asdfhjasklfunakfyknyuadf");
		
	}
	@Given("I have an id as numeric for update")
	public void i_have_an_id_as_numeric_for_update() {
		obj.put("id", random.generateNumberUniversity());
	}
	
	@Given("I have an id as boolean for update")
	public void i_have_an_id_as_boolean_for_update() {
		obj.put("id", active);
	}
	
	@Given("I have an id as null for update")
	public void i_have_an_id_as_null_for_update() {
		stat = null;
		obj.put("id", stat);
	}
	
	
	// C A T E G O R Y  - -  V A L U E S
	
	@And("I have an category for update")
	public void i_have_an_category_for_udpate() {
		techString = random.Tech();
		obj.put("category", techString);
	}
	
	@Given("I have an category as capital letters for update")
	public void i_have_an_category_as_capital_letters_for_update() {
		obj.put("category", "JUAN");
	}
	@Given("I have an category as numeric for update")
	public void i_have_an_category_as_numeric_for_update() {
		obj.put("category", random.generateNumberUniversity());
	}
	@Given("I have an category as boolean for update")
	public void i_have_an_category_as_boolean_for_update() {
		obj.put("category", active);
	}
	@Given("I have an category as null for update")
	public void i_have_an_category_as_null_for_update() {
		stat = null;
		obj.put("id", stat);
	}
	
	// T I T L E  - - V A L U E S
	
	@Given("I have an title for update")
	public void i_have_an_title_for_update() {
		obj.put("title", "Test Demo UP");
	}
	
	@And("I have an title as capital letter for update")
	public void i_have_an_title_as_capital_letters_for_update() {
		obj.put("title", "Java 8 Basics");
	}
	@And("I have an title as numeric for update")
	public void i_have_an_title_as_numeric_for_update() {
		obj.put("title", random.generateNumberUniversity());
	}
	@And("I have an title as boolean for update")
	public void i_have_an_title_as_boolean_for_update() {
		obj.put("title", active);
	}
	@And("I have an title as null for update")
	public void i_have_an_title_as_null_for_update() {
		stat = null;
		obj.put("title", stat);
	}
	
	// D E S C R I P T I O N  - - V A L U E S
	
	@And("I have an description for update")
	public void i_have_an_description_for_udpate() {
		obj.put("description", "Course about Java 8 basics UP");
	}
	
	@And("I have an description as capital letters for update")
	public void i_have_an_description_as_capital_letters_for_update() {
		obj.put("description", "Update Java 8");
	}
	@And("I have an description as numeric for update")
	public void i_have_an_description_as_numeric_for_update() {
		obj.put("description", random.generateNumberUniversity());
	}
	@And("I have an description as boolean for update")
	public void i_have_an_description_as_boolean_for_update() {
		obj.put("description", active);
	}
	@And("I have an description as null for update")
	public void i_have_an_description_as_null_for_update() {
		stat = null;
		obj.put("description", stat);
	}
	
	// I M G   - -  V A L U E S
	
	@And("I have an img for update")
	public void i_have_an_img_for_udpate() {
		obj.put("img", 2);
	}
	
	@And("I have an img as capital letters for update")
	public void i_have_an_img_as_capital_letters_for_update() {
		obj.put("img", "juan.com");
	}
	@And("I have an img for as numeric update")
	public void i_have_an_img_as_numeric_for_update() {
		obj.put("img", random.generateNumberUniversity());
	}
	@And("I have an img for as boolean update")
	public void i_have_an_img_as_boolean_for_update() {
		obj.put("img", active);
	}
	@And("I have an img for as null update")
	public void i_have_an_img_as_null_for_update() {
		stat = null;
		obj.put("img", stat);
	}
	
	// S T A T U S  - - V A L U E S
	@And("I have an status for update")
	public void i_have_an_status_for_udpate() {
		obj.put("status", 1);
	}
	
	@And("I have an status as capital letters for update")
	public void i_have_an_status_as_capital_letters_for_update() {
		obj.put("status", "juan.com");
	}
	@And("I have an status as numeric for update")
	public void i_have_an_status_as_numeric_for_update() {
		obj.put("status", random.generateNumberUniversity());
	}
	@And("I have an status as boolean for update")
	public void i_have_an_status_as_boolean_for_update() {
		obj.put("status", active);
	}
	@And("I have an status as null for update")
	public void i_have_an_status_as_null_for_update() {
		stat = null;
		obj.put("status", stat);
	}
	
	// W H E N
	
	@When("I update sprint using PUT operation")
	public void i_update_sprint_using_PUT_operation() {
		base.requestBody = obj.toString();
		System.out.println(base.requestBody);
		
		base.apiResource = ApiPaths.UNIVERSITY_API_JAVA_ENDPOINT;
		base.ServiceApi = new ApiTools();
	    base.response = base.ServiceApi.PUTMethod(base.apiResource,base.requestBody);
		base.responseBody = base.response.getBody();
		base.method = "PUT";		
		statusCodeRetrieved = base.response.getStatusCodeValue();
		
		System.out.println(base.apiResource);
		System.out.println(base.responseBody);
		System.out.println(statusCodeRetrieved);
		
		myTools.resource( ApiPaths.UNIVERSITY_API_JAVA_ENDPOINT);
        myTools.statusCode(String.valueOf(statusCodeRetrieved));
        myTools.responseBody(base.responseBody);

	}
	
	@Then("I should return an status {string}")
	public void i_should_return_an_status(String statusCode) {
			int value = Integer.parseInt(statusCode);
			Assert.assertEquals(value, base.response.getStatusCodeValue());
			//Assert.assertEquals(statusCode, myTools.statusCode(String.valueOf(statusCodeRetrieved)));
		}
	
	
	
	
	
}
