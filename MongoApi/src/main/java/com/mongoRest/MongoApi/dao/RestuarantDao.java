package com.mongoRest.MongoApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongoRest.MongoApi.model.Restuarant;

@Component
public class RestuarantDao {
    @Autowired
	MongoTemplate mongoTemplate;
    public Restuarant saveRestuarant(Restuarant restuarant) {
    	try {
    		mongoTemplate.save(restuarant);
    		return restuarant;
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public List<Restuarant> getAll()
    {

    return mongoTemplate.findAll(Restuarant.class);

    }
    public Restuarant getRest(String restId)
    {

    Query query=new Query();
    query.addCriteria(Criteria.where("restId").is(restId));

    return mongoTemplate.findOne(query,Restuarant.class);

    }


	
}
