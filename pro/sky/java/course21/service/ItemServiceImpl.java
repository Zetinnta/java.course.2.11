package pro.sky.java.course21.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course21.storage.Bucket;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    public final Bucket bucket;

    public ItemServiceImpl(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemID) {
        return bucket.addItems(itemID);
    }

    @Override
    public List<Integer> getList() {
        return bucket.getItems();
    }
}
