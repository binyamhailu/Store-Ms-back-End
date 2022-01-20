package com.example.reactnativedemo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item  {
    @Id
    private String id ;

    private String name ;
    private String Image ;
    private String Desc ;
    private double price ;
    private String catagory ;
    private ItemStatus itemStatus ;
    private Date createdDate ;
    private Date approvedDate ;
    private Date rejectedDate ;


}
