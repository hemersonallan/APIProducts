package br.com.devaws.productsapi.productsapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductsController {
    
    @GetMapping("/")
    public List<Products> listProducts(){
        ArrayList<Products> list = new ArrayList<Products>();
        list.add(new Products("Produto11","Codigo10"));
        list.add(new Products("Produto22","Codigo20"));
        list.add(new Products("Produto33","Codigo30"));
        list.add(new Products("Produto33","Codigo30"));
        list.add(new Products("Produto44","Codigo40"));
        return list;
    }
}
