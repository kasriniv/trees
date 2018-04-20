package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Trees;

public class DefaultApiImpl implements DefaultApi {

	@Override
	public Trees treesGet() {
		// TODO Auto-generated method stub
		Trees mytree=new Trees();
		mytree.setCategory("coniferous");
		mytree.setName("Xmas");
		mytree.setRegion("North America");
		return mytree;
	}

}
