package com.splusk.template.bid.operations;

import static org.junit.Assert.assertNotNull;

import java.net.URL;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.splusk.template.bid.domain.Bid;
import com.splusk.template.jaxrs.rs.JaxRsActivator;

@RunWith(Arquillian.class)
@RunAsClient
public class BidResourceRestEasyClientTest {
    private static final String RESOURCE_PREFIX = JaxRsActivator.class.getAnnotation(ApplicationPath.class).value().substring(1);

    @ArquillianResource
    URL deploymentUrl;
    
    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "test.war")
                .addPackage(Bid.class.getPackage())
                .addPackage(IBidResource.class.getPackage())
                .addClasses(JaxRsActivator.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @BeforeClass
    public static void initResteasyClient() {
        RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
    }

    @Test
    @GET
    public void testGetCustomerByIdUsingClientProxy() throws Exception {
        //BidResource will be used as the concrete implementation (magic), but maybe it would be better to be more explicit in the code.
        IBidResource client = ProxyFactory.create(IBidResource.class, deploymentUrl.toString() + RESOURCE_PREFIX);
        Bid response = client.getBid("1");

        assertNotNull(response);
        Assert.assertTrue(response.getBidId().equals("1"));
    }
}
