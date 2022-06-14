package org.generation.SpringAssessment.service;
import org.generation.SpringAssessment.repository.ItemRepository;
import org.generation.SpringAssessment.repository.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ItemServiceMySQL implements ItemService {

    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }


    @Override
    public Item save(Item item) {
        //access the database with the connection and perform insert query
        return itemRepository.save(item);
    }

    @Override
    public void delete(int itemId){
        itemRepository.deleteById(itemId);
    }

    @Override
    public List<Item> all() {

        List<Item> result = new ArrayList<>();
        itemRepository.findAll().forEach((result :: add));
        return result;
    }

    @Override
    public Item findById(int itemId){       //update product into and delete a product

        Optional<Item> item = itemRepository.findById(itemId);  // cannot be null
        Item itemResponse = item.get();
        return itemResponse;
    }


}
