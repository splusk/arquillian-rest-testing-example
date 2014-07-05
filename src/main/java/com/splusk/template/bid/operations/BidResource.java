package com.splusk.template.bid.operations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.splusk.template.bid.domain.Bid;

@Path("/bids")
public class BidResource {

    @GET
    @Path("/{id:[1-9][0-9]*}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bid getBid(@PathParam("id") String bidId) {
        return createDummyOrder(bidId);
    }
    
    private Bid createDummyOrder(String bidId) {
        int itemId = 10;
        int points = 100;
        return new Bid(bidId, "aUserId", itemId, points);
    }
}
