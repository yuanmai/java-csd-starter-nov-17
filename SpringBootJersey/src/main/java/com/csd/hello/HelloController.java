package com.csd.hello;

import com.benjiweber.html.HtmlDsl;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Component
@Path("/hello")
public class HelloController implements HtmlDsl {


    @GET
    @Path("/world")
    @Produces(MediaType.TEXT_HTML)
    //@Consumes("application/json")
    public String hello() {
        return html(
                head(),
                body(
                        h1("Hello World"),
                        article(
                                p("Here is an interesting paragraph"),
                                p(
                                        "And another",
                                        small("small")
                                ),
                                ul(
                                        li("An"),
                                        li("unordered"),
                                        li("list")
                                )
                        )
                )
        ).asString();
    }


}