package org.generation.SpringAssessment.repository;

import org.generation.SpringAssessment.repository.entity.Item;
import org.springframework.data.repository.*;


public interface ItemRepository extends CrudRepository<Item, Integer>
{

}