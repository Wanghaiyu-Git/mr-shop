package com.baidu.shop.mapper;

import com.baidu.shop.dto.SkuDTO;
import com.baidu.shop.entity.SkuEntity;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassName SkuMapper
 * @Description: TODO
 * @Author shenyaqi
 * @Date 2020/9/8
 * @Version V1.0
 **/
public interface SkuMapper extends Mapper<SkuEntity> {

    @Select(value = "select k.*,stock from tb_sku k , tb_stock t where k.id = t.sku_id and k.spu_id=#{spuId}")
    List<SkuDTO> selectSkuAndStockBySpuId(Integer spuId);
}
