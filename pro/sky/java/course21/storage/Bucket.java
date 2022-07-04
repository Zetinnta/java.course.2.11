package pro.sky.java.course21.storage;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@SessionScope
@Component
public class Bucket {
    private final List<Integer> bucket;

    public Bucket() {
        this.bucket = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> listID) {
        bucket.addAll(listID);
        return listID;
    }

    public List<Integer> getItems() {
        return Collections.unmodifiableList(bucket);
    }
}
