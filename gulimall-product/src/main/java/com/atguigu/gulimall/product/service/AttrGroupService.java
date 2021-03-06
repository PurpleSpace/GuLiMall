package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrGroupWithAttrsVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author bsiyu
 * @email 1830274250@gmail.com
 * @date 2020-10-07 19:57:47
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

//    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> attrgroupWithattrByCatelogId(Long catelogId);
}

