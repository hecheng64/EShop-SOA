package cn.sinjinsong.eshop.dao.product;

import cn.sinjinsong.eshop.common.domain.entity.product.ProductDO;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int insert(ProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int insertSelective(ProductDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    ProductDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProductDO record);

    Page<ProductDO> findByCategoryPaging(@Param("categoryId") Long category, @Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    List<ProductDO> findByCategory(@Param("categoryId") Long category);

    List<ProductDO> findOnPromotion();

    List<ProductDO> findSimpleByCategory(@Param("categoryId") Long category);

    List<Long> findProductIdsByCategory(@Param("categoryId")Long category);
}