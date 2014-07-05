package com.splusk.template.bid.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Basic TimeOff bid
 * 
 * Can also be a JPA entity if you want
 * 
 */
//@Entity
//@NoSql(dataType = "Bid", dataFormat = DataFormatType.MAPPED)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bid {

    //private static final long serialVersionUID = 4759787642492777754L;
    /** Bid type **/
    private String type = this.getClass().getSimpleName();
    /** Order item */
    private int itemId;
    /** Set points for bid */
    private int points;
    /** A user unique id */
    private String userId;
    /** The (should be a generated value) bid id. This should be unique */
    private String bidId;

    public Bid() {
    }

    //For testing
    public Bid(String bidId, String userId, int itemId, int points) {
        setBidId(bidId);
        setUserId(userId);
        setItemId(itemId);
        setPoints(points);
    }

    private void setBidId(String bidId) {
        this.bidId = bidId;
    }

    private void setUserId(String crewId) {
        this.userId = crewId;
    }

    private void setItemId(int itemId) {
        this.itemId = itemId;
    }

    private void setPoints(int points) {
        this.points = points;
    }

    public String getBidId() {
        return bidId;
    }

    public String getUserId() {
        return userId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getPoints() {
        return points;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return " Bid: " + type + "(UserID: " + userId + " item id: " + itemId + ")";
    }
}
