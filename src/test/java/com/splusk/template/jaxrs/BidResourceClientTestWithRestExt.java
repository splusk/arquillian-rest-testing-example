package com.splusk.template.jaxrs;
//package com.jeppesen.jcms.bid.operations;
//
//import static org.junit.Assert.assertNotNull;
//
//import java.net.URL;
//
//import javax.ws.rs.GET;
//
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.extension.rest.client.ArquillianResteasyResource;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.arquillian.test.api.ArquillianResource;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.spec.WebArchive;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.junit.runner.RunWith;
//
//import com.jeppesen.jcms.jaxrs.rs.JaxRsActivator;
//
//@RunWith(Arquillian.class)
//public class BidResourceClientTestWithRestExt {
//
//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();
//
//    @ArquillianResource
//    private URL deploymentURL;
//
//    @Deployment(testable = false)
//    public static WebArchive create() {
//        return ShrinkWrap.create(WebArchive.class).addClasses(BidResource.class, IBidResource.class, JaxRsActivator.class, TimeOffBid.class);
//    }
//
//    @Test
//    @GET
//    public void getBid(@ArquillianResteasyResource("rest") BidResource bidResource) {
//        final String bidId = "123";
//
//        final TimeOffBid result = bidResource.getBid(bidId);
//
//        assertNotNull(result);
//    }
//
//}