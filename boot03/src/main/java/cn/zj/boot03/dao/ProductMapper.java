package cn.zj.boot03.dao;

import cn.zj.boot03.entity.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 实现增删改查的方法

    @Insert(" insert into product (title,price,num) " +
            " value(#{title},#{price},#{num}) ")
    int insertProduct(Product product);
    @Update("update product set title=#{title},price=#{price},num=#{num} where id=#{id}")
    int updateProduct(Product product);
    @Delete("delete from product where id = #{id}")
    int deleteProduct(Integer id);
    @Select("select * from product")
    List<Product> selectProduct();
    @Select("select * from product where id = #{id}")
    Product selectProductById(Integer id);

}
