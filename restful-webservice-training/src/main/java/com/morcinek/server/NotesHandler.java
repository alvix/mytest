package com.morcinek.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/notes")
@Produces({"application/xml"})
public class NotesHandler {

    @GET
    public String list() {
        return "<b>Hello World, I still need some work to be useful!</b>";
    }

}