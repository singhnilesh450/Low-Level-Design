package SimpleCacheDesign.Cache.storage;

import SimpleCacheDesign.Cache.exceptions.NotFoundException;

public interface Storage<Key, Value> {
    public void add(Key key,Value value);
    public void remove(Key key) throws NotFoundException;
    public Value get(Key key) throws  NotFoundException;
}
