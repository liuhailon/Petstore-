package nf147.pet.dao;

import java.util.List;
import nf147.pet.entity.Orders;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    Orders selectByPrimaryKey(Integer id);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}