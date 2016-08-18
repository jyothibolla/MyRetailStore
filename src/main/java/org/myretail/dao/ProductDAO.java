package org.myretail.dao;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.myretail.model.Product;

import com.mongodb.MongoClient;
 
/**
 * 
 * For data access operations on the Database
 *
 */
public class ProductDAO extends BasicDAO<Product, String> {   
 
    public ProductDAO(MongoClient mongoClient, Morphia morphia, String dbName) {       
    	super(mongoClient, morphia, dbName);
    }     
}