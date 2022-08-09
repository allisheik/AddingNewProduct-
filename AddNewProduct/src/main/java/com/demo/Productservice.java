package com.demo;

public class Productservice {
	ProductDetailsDao ps=new ProductDetailsDao();
	public String storeEmployee(ProductDetails pd) {
        if(pd.getPrice()<1000) {
            return " Price of the product must be greater than 1000";
        }else if(ps.storeProduct(pd)>0) {
            return " Record Inserted Successfully";
        }else {
            return " Cannot Insert Record";
        }
    }
	
}