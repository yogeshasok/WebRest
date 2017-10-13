package com.journaldev.jaxrs.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
	public class TestService {
/*
		@GET
		@Path("/hello/{msg}")
		public String sayHello(@PathParam(value="msg") String msg){
			return "Hello "+msg;
		}
		*/
	/*
	@GET
	@Produces("text/html")
	public Response getc(@QueryParam("nameKey") String name,
            @QueryParam("countryKey") String country){
		String output = "Customer name - "+name+", Country - "+country+"";
        return Response.status(200).entity(output).build();
 */
	/*
	@GET
    @Produces("text/html")
    public Response getResultByPassingValue(
                    @MatrixParam("nameKey") String name,
                    @MatrixParam("countryKey") String country) {
        
        String output = "Customer name - "+name+", Country - "+country+"";
        return Response.status(200).entity(output).build();
 
    }
		*/
	/*
	@POST
    @Path("/addCustomer")
    @Produces("text/html")
    public Response getResultByPassingValue(
                    @FormParam("nameKey") String name,
                    @FormParam("countryKey") String country) {
        
        String output = "<font face='verdana' size='2'>" +
                "Web Service has added your Customer information with Name - <u>"+name+"</u>, Country - <u>"+country+"</u></font>";
        return Response.status(200).entity(output).build();
 
    }
	*/
	 @GET
    @Path("/{cusNo}")
    @Produces("application/json")
    public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") int no) {
 
        /*
         * I AM PASSING CUST.NO AS AN INPUT, SO WRITE SOME BACKEND RELATED STUFF AND
         * FIND THE CUSTOMER DETAILS WITH THAT ID. AND FINALLY SET THOSE RETRIEVED VALUES TO
         * THE CUSTOMER OBJECT AND RETURN IT, HOWEVER IT WILL RETURN IN JSON FORMAT :-)
         * */
        
        Customer cust = new Customer();        
            cust .setCustNo(no);
            cust .setCustName("Java4s");
            cust .setCustCountry("India");
        return cust;
    }
	
	// For Testing REST
	/*
	 @GET
	    @Produces("text/plain")
	    @Path("{id}")
	    public Response getCustomerDetails(@PathParam("id") String custId) {
	        
	         //CODE TO FETCH CUSTOMER DETAILS FROM THE DATABASE USING CUSTOMER ID
	        String output = "Customer Details With ID "+custId+" Has Been fetched Successfully";
	        return Response.status(200).entity(output).build();
	     }
	    
	    @POST
	    @Produces("text/plain")
	    @Path("{id}")
	    public Response insertCustomer(@PathParam("id") String custId) {
	        
	         //CODE TO INSERT CUSTOMER DETAILS USING CUSTOMER ID
	        String output = "Customer Data With ID "+custId+" Has Been Saved Successfully";
	        return Response.status(200).entity(output).build();
	     }
	 
	    @PUT
	    @Produces("text/plain")
	    @Path("{id}")
	    public Response updateCustomerDetails(@PathParam("id") String custId) {
	        
	         //CODE TO UPDATE CUSTOMER DETAILS USING CUSTOMER ID
	        String output = "Customer Data With ID "+custId+" Has Been Updated Successfully";
	        return Response.status(200).entity(output).build();
	     }
	    
	    @DELETE
	    @Produces("text/plain")
	    @Path("{id}")
	    public Response deleteCustomer(@PathParam("id") String custId) {
	        
	         //CODE TO DELETE CUSTOMER DETAILS USING CUSTOMER ID
	        String output = "Customer With ID "+custId+" Has Been Deleted From the Database.";
	        return Response.status(200).entity(output).build();
	     }*/
}
