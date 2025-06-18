package org.example.mapper;

import org.example.entity.yifuku;
import java.util.List;

public interface yifukumapper {
    List<yifuku> selectByManufacturerCode(String manufacturerCode);
    int insertyifuku(yifuku yifuku);
    int deleteyifukuById(Integer id);
    List<yifuku> selectAll();
    List<yifuku> selectByXinghao(String xinghao);
}