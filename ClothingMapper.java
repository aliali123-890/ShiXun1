package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Clothing;
import java.util.List;

public interface ClothingMapper {
    List<Clothing> selectByTypePrefix(@Param("typePrefix") String typePrefix);
}