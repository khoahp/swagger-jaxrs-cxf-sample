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

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.sample.model.MySampleEntry;

@Path("/mysampleresource")
@Api(value = "/mysampleresource", description = "Operations about sample")
@Produces({"application/json", "application/xml"})
public class MySampleResource {
  static MySampleEntry mysampleentry = new MySampleEntry();
  
  @POST
  @ApiOperation(value = "Add a new entry")
  @ApiResponses(value = { @ApiResponse(code = 405, message = "Invalid input") })
  public Response addNewEntry(
      @ApiParam(value = "New entry that needs to be added", required = true) MySampleEntry se) {
	  Gson gson = new Gson();
	  String jsonString = gson.toJson(se);
    return Response.ok().entity("SUCCESS").build();
  }
}
