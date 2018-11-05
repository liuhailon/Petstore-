package nf147.pet.dao;

import java.util.List;
import nf147.pet.entity.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer tagId);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);
}