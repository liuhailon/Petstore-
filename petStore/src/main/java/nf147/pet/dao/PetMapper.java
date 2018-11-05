package nf147.pet.dao;

import java.util.List;
import nf147.pet.entity.Pet;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

public interface PetMapper {
    int deleteByPrimaryKey(Integer petId);

    int insert(Pet record);

    Pet selectByPrimaryKey(Integer petId);

    List<Pet> selectAll();

    List<Pet> queryPetByStatus(String status);

    int updateByPrimaryKey(Pet record);
}