package guru.springframework;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootWebApplication implements CommandLineRunner{
    @Autowired
    ProductRepository dao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        for (int i = 0; i < 1000; i++) {
            Product p=new Product();
            p.setDescription("xxxxxxxx");
            p.setImageUrl("xxxxxxx");
            p.setPrice(new BigDecimal(i));
            dao.save(p);
        }
    }
}
