package org.agoncal.quarkus.starting;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks(){
        return List.of(
                new Book(1,"Gita message for Leaders","deepak bajaj",2023,"Spritual"),
                new Book(2,"Quarkus openshift","deepak bajaj",2024,"IT"),
                new Book(3," openshift"," Kapoor",2024,"IT"),
                new Book(4,"Kube","Swati bajaj",2024,"IT")
        );
    }


    public int countAllBooks(){

        return getAllBooks().size();
    }


    public Optional<Book> getBook(@PathParam("id") int id){
        return getAllBooks().stream().filter(book -> book.id ==id).findFirst() ;
    }



    public String hello() {
        return "Hello world";
    }


}