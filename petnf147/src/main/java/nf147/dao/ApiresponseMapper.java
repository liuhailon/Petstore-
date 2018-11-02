package nf147.dao;

import java.util.List;
import nf147.entity.Apiresponse;

public interface ApiresponseMapper {
    int deleteByPrimaryKey(Integer code);

    int insert(Apiresponse record);

    Apiresponse selectByPrimaryKey(Integer code);

    List<Apiresponse> selectAll();

    int updateByPrimaryKey(Apiresponse record);
}