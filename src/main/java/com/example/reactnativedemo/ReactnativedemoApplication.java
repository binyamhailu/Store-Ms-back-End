package com.example.reactnativedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactnativedemoApplication implements CommandLineRunner {

    @Autowired
    private  UserRepository userRepository ;
    @Autowired
    private ItemRepository itemRepository ;
    public static void main(String[] args) {
        SpringApplication.run(ReactnativedemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("WORKING DEMO");
//        User user = new User() ;
//        user.setName("name");
//        user.setPassword("password");
//        user.setUserType(UserType.ADMIN);
//        User user1 = new User() ;
//
//        user1.setName("name1");
//        user1.setPassword("password1");
//        user1.setUserType(UserType.INVESTER);
//        userRepository.save(user) ;
////        userRepository.save(user1) ;
//        Item item = new Item() ;
//        item.setCatagory("ELECTRONICS");
//        item.setDesc("Descrption for electronics");
//        item.setImage("Image url");
//        item.setName("item name");
//        item.setPrice(1000);
//        item.setItemStatus(ItemStatus.PENDING);
//        Item item2 = new Item() ;
//
//        item2.setCatagory("ELECTRONICS");
//        item2.setDesc("Descrption for electronics");
//        item2.setImage("Image url");
//        item2.setName("item name");
//        item2.setPrice(1000);
//        item2.setItemStatus(ItemStatus.REJECTED);
//
//        Item item3 = new Item() ;
//
//        item3.setCatagory("ELECTRONICS");
//        item3.setDesc("Descrption for electronics");
//        item3.setImage("Image url");
//        item3.setName("item name");
//        item3.setPrice(1000);
//        item3.setItemStatus(ItemStatus.ACCEPTED);
//
//        itemRepository.save(item);
//        itemRepository.save(item2) ;
//        itemRepository.save(item3) ;

    }
}
