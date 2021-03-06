package com.xuanyuan.training.project.docker.service;

import java.util.List;
import com.xuanyuan.training.project.docker.domain.HzImage;

/**
 * 系统镜像Service接口
 * 
 * @author Lee
 * @date 2020-04-05
 */
public interface IHzImageService 
{
    /**
     * 查询系统镜像
     * 
     * @param id 系统镜像ID
     * @return 系统镜像
     */
    public HzImage selectHzImageById(Long id);

    /**
     * 查询系统镜像列表
     * 
     * @param hzImage 系统镜像
     * @return 系统镜像集合
     */
    public List<HzImage> selectHzImageList(HzImage hzImage);

    /**
     * 新增系统镜像
     * 
     * @param hzImage 系统镜像
     * @return 结果
     */
    public int insertHzImage(HzImage hzImage);

    /**
     * 修改系统镜像
     * 
     * @param hzImage 系统镜像
     * @return 结果
     */
    public int updateHzImage(HzImage hzImage);

    /**
     * 批量删除系统镜像
     * 
     * @param ids 需要删除的系统镜像ID
     * @return 结果
     */
    public int deleteHzImageByIds(Long[] ids);

    /**
     * 删除系统镜像信息
     * 
     * @param id 系统镜像ID
     * @return 结果
     */
    public int deleteHzImageById(Long id);
}
