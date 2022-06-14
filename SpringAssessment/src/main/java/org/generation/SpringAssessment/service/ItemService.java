package org.generation.SpringAssessment.service;

import java.util.List;
import org.generation.SpringAssessment.repository.entity.*;

public interface ItemService {
    List<Item> all();

    Item save(Item item);

    void delete(int itemId);

    Item findById(int itemId);
}
