// tag::sample[]
package com.sriharilabs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customer")
public class Summary {

	
   private String mvmUseCases;
   private String tdmTableName;
   @Id
   private String modelId;
   
    
  

}

