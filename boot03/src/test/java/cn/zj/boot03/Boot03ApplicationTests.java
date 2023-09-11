package cn.zj.boot03;

import cn.zj.boot03.dao.ProductMapper;
import cn.zj.boot03.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot03ApplicationTests {
    @Autowired(required = false)
    ProductMapper pm;

    @Test
    void contextLoads() {
    }

    @Test
    public void insertProduct(){
        Product pr = new Product();
        pr.setTitle("AmricanMobil");
        pr.setPrice(39.00);
        pr.setNum(100);
        pm.insertProduct(pr);
        System.out.println("添加成功");
    }
    @Test
    public void updateProduct(){
        Product pr = new Product();
        pr.setId(17);
        pr.setTitle("国家通信");
        pr.setPrice(20.99);
        //pr.setNum(100);
        pm.updateProduct(pr);
        System.out.println("更新成功");
    }
    @Test
    public void deleteProduct(){
        pm.deleteProduct(3);
    }
    @Test
    public void selectProduct(){
        System.out.println(pm.selectProduct());
    }
    @Test
    public void selectProductById(){
        System.out.println(pm.selectProductById(4));
    }

}
