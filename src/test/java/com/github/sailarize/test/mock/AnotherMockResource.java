package com.github.sailarize.test.mock;

import com.github.sailarize.resource.SailResource;
import com.github.sailarize.resource.Path;

@Path("/anothers")
public class AnotherMockResource extends SailResource {

	public AnotherMockResource(String id) {
		super(id);
	}

}
