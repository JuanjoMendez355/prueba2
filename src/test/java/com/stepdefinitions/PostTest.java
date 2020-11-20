package com.stepdefinitions;

import com.globalClasses.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class PostTest {

	 private BasicSecurityUtil base;
     JSONArray jsonresult=new JSONArray();

     String field, id="_id", cat="category",tit="title",desc="description",im="img", stat="status";
     JSONObject obj=new JSONObject();


     String category,title,description,img;
     int status;
     public PostTest(BasicSecurityUtil base){ this.base=base;}


    RandomTools random = new RandomTools();

    @Given("I have a course category outside the enum")
    public void i_have_a_course_category_outside_the_enum() {
        // Write code here that turns the phrase above into concrete actions
        category="android";
    }

    @Given("I have a title")
    public void i_have_a_title() {
        // Write code here that turns the phrase above into concrete actions
        title=random.randomFirstName();
    }

    @Given("I have a description")
    public void i_have_a_description() {
        // Write code here that turns the phrase above into concrete actions
        description=random.randomPokemon();
    }

    @Given("I have a img")
    public void i_have_a_img() {
        // Write code here that turns the phrase above into concrete actions
        img=random.randomAlphanumeric();
    }

    @Given("I have a status")
    public void i_have_a_status() {
        // Write code here that turns the phrase above into concrete actions
        status=1;
    }


    @Given("I have a course category")
    public void i_have_a_course_category() {
        // Write code here that turns the phrase above into concrete actions
        category="Java";
    }

    @Given("I dont have title")
    public void i_dont_have_title() {
        // Write code here that turns the phrase above into concrete actions
        title=null;
    }


    @Given("I have a status is a teen")
    public void i_have_a_status_is_a_teen() {
        // Write code here that turns the phrase above into concrete actions
        status=10;

    }




    @Given("I have a title is space blank")
    public void i_have_a_title_is_space_blank() {
        // Write code here that turns the phrase above into concrete actions
        title="";
    }


    @Given("I have a category in lower and upper case")
    public void i_have_a_category_in_lower_and_upper_case() {
        // Write code here that turns the phrase above into concrete actions
        category="JaVa";
    }
    @Given("I prepare the resource")
    public void i_prepare_the_resource() {
        // Write code here that turns the phrase above into concrete actions

        obj.put("category", category);
        obj.put("title", title);
        obj.put("description", description);
        obj.put("status",status);
        obj.put("img", img);
        base.requestBody = obj.toString();

        System.out.println(obj.toString());
    }

    @When("I try create a new course on the API")
    public void i_try_create_a_new_course_on_the_API() {
        // Write code here that turns the phrase above into concrete actions
        base.apiResource= ApiPaths.UNIVERSITY_APY_JAVA_ENDPOINT_POST;
        base.ServiceApi = new ApiTools();
        base.response=base.ServiceApi.POSTMethod("course",base.requestBody);
        base.responseBody=base.response.getBody();
        System.out.println(base.responseBody);
        base.method="POST";
        
        System.out.println(base.apiResource);
		System.out.println(base.responseBody);
		
    }



    @Then("the API should indicate status error")
    public void the_API_should_indicate_status_error() {
        // Write code here that turns the phrase above into concrete actions
        JSONObject result= new JSONObject(base.responseBody);
        String error="Bad Request";
        assertEquals(result.get("error"),error);
        int code=400;
        int coderes = Integer.parseInt(base.response.getStatusCode().toString().substring(0,3));
        assertEquals(code,coderes);
    }
    @Then("the API should indicate status ok")
    public void the_API_should_indicate_status_ok() {
        // Write code here that turns the phrase above into concrete actions
        int code=201;
        int result=Integer.parseInt(base.response.getStatusCode().toString().substring(0,3));
        assertEquals(code,result);
    }


}
