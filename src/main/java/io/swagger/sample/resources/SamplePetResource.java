/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.swagger.sample.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.sample.data.PetData;
import io.swagger.sample.exception.NotFoundException;
import io.swagger.sample.model.Pet;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/pet1")
//@Api(value = "/pet1", description = "Operations about pets")
@Produces({"application/json", "application/xml"})
public class SamplePetResource {
  static PetData petData = new PetData();

  @GET
  @Path("/{petId}")
  //@ApiOperation(value = "Find pet by ID", 
    //notes = "Returns a pet when 0 < ID <= 10.  ID > 10 or nonintegers will simulate API error conditions"
  //)
  //@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
  //@ApiResponse(code = 404, message = "Pet not found") })
  public Pet getPetById(
      //@ApiParam(value = "ID of pet that needs to be fetched", allowableValues = "range[1,10]", required = true)
      @PathParam("petId") Long petId)
      throws NotFoundException {
    Pet pet = petData.getPetById(petId);
    if (null != pet) {
      return pet;
    } else {
      throw new NotFoundException(404, "Pet not found");
    }
  }
}
