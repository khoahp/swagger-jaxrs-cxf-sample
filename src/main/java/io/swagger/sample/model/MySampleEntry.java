package io.swagger.sample.model;

import io.swagger.annotations.ApiModelProperty;

public class MySampleEntry {
	
	 	private String category;
	    private int id;
	    private String name;

	    public String getCategory ()
	    {
	        return category;
	    }
	    
	    
	    @ApiModelProperty(value = "Category type", allowableValues = "Others, Fruit", required = true )
	    public void setCategory (String category)
	    {
	        this.category = category;
	    }

	    @ApiModelProperty(value = "id", allowableValues = "integers", required = true)
	    public int getID ()
	    {
	        return id;
	    }

	    public void setID (int id)
	    {
	        this.id = id;
	    }

	    @ApiModelProperty(value = "name", allowableValues = "apple, orange, grapes, others", required = true)
	    public String getName ()
	    {
	        return name;
	    }

	    public void setType (String name)
	    {
	        this.name = name;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [category = "+category+", ID = "+id+", name = "+name+"]";
	    }
}
