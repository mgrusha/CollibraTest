package com.grusha.testtask.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.IsNot.not;


public class RestTest {

    final String URL = "https://jsonplaceholder.typicode.com/comments";

    @Test
    public void checkCodeAndEmail() {
        RestAssured.get(URL).then().statusCode(200).
                and().assertThat().body("email", hasItems("Jayne_Kuhic@sydney.com"));
    }

    @Test
    public void deserializeAndFilter() {
        String expectedText = "non";
        int expectedPostId = 1;

        Response response = RestAssured.get(URL);
        List<Comment> unfilteredComments = Arrays.asList(response.as(Comment[].class));
        List<Comment> filteredComments = new LinkedList<>();
        unfilteredComments.stream().filter(c -> c.getPostId() == expectedPostId).filter(c -> c.getBody()
                .contains(expectedText)).forEach(filteredComments::add);
        assertThat(filteredComments, is(not(empty())));
    }
}
