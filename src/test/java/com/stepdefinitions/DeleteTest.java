package com.stepdefinitions;

import com.globalClasses.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.json.JSONArray;
import org.json.JSONObject;


import static org.junit.Assert.assertEquals;

public class DeleteTest {

	private BasicSecurityUtil base;
    RandomTools random = new RandomTools();
    JSONArray jsonArray= new JSONArray();
    JSONObject obj=new JSONObject();

    String id, category,title,description;
    int status=1;
    int stat;
    String testcat,testtit,testdesc;

    public DeleteTest(BasicSecurityUtil base){
        this.base=base;
    }

    //background

    @Given("course and get course information")
    public void course_and_get_course_information(){

        category="Java";
        title=random.randomFirstName();
        description=random.randomAlphanumeric();

        obj.put("category",category);
        obj.put("title",title);
        obj.put("description",description);
        obj.put("status",status);
        base.requestBody=obj.toString();
        base.apiResource= ApiPaths.SPRINT_API_JAVA_ENDPOINT_DELETE;
        base.ServiceApi=new ApiTools();
        base.response=base.ServiceApi.POSTMethod("course",base.requestBody);
        base.responseBody=base.response.getBody();
        base.method="POST";


    }
// scenario


    @Given("check course in mongoDB and ID course")
    public void check_course_in_mongoDB_and_ID_course() {
        // Write code here that turns the phrase above into concrete actions
        id=base.responseBody.substring(7,31);
    }


    @Given("I have a random ID")
    public void i_have_a_random_ID() {
        // Write code here that turns the phrase above into concrete actions
        id=random.randomAlphanumeric();
    }



    @Given("check course in mongoDB and tabs id and category")
    public void check_course_in_mongoDB_and_tabs_id_and_category() {
        // Write code here that turns the phrase above into concrete actions
        id=base.responseBody.substring(7,31);
        testcat=category;
    }



    @Given("check course in mongoDB and tabs id and status")
    public void check_course_in_mongoDB_and_tabs_id_and_status() {
        // Write code here that turns the phrase above into concrete actions
        id=base.responseBody.substring(7,31);
        stat=status;
    }


    @Given("check course in mongoDB and tabs description and title")
    public void check_course_in_mongoDB_and_tabs_description_and_title() {
        // Write code here that turns the phrase above into concrete actions
        id=base.responseBody.substring(7,31);
        testtit=title;
    }

    @Given("I prepare the delete resource")
    public void I_prepare_the_delete_resource(){
        System.out.println(id);

    }

    @When("I try delete a course on the API")
    public void i_try_delete_a_course_on_the_API() {
        // Write code here that turns the phrase above into concrete actions
        base.ServiceApi=new ApiTools();
        base.response=base.ServiceApi.retrieveDelete("course/"+id);
        base.method="DELETE";
        System.out.println(base.response);
    }


    @Then("the API should indicate status no content")
    public void the_API_should_indicate_status_no_content() {
        int result= Integer.parseInt(base.response.getStatusCode().toString().substring(0,3));
        int code=204;
        assertEquals(code, result);


    }

    @Then("the API should indicate status not found")
    public void the_API_should_indicate_status_not_found() {
        int result= Integer.parseInt(base.response.getStatusCode().toString().substring(0,3));
        int code=404;
        assertEquals(code,result);

    }
}
