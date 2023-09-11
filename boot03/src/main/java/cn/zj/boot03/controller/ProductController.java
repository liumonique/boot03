package cn.zj.boot03.controller;

import cn.zj.boot03.dao.ProductMapper;
import cn.zj.boot03.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// 增加 查询所有 删除
@RestController
public class ProductController {

    @Autowired(required = false)
    private ProductMapper productMapper;

    @RequestMapping("/insert")
    public String insertProduct(Product product){
        int num = productMapper.insertProduct(product);
        return "成功出入"+num+"条";
    }
    @RequestMapping("/select")
    public List<Product> selectAll(){
        return productMapper.selectProduct();
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        System.out.println("删除的id = "+id);
        int num = productMapper.deleteProduct(id);
        if(num>0){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
