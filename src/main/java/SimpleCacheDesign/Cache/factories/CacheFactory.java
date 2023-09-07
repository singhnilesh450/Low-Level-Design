package SimpleCacheDesign.Cache.factories;

import SimpleCacheDesign.Cache.Cache;
import SimpleCacheDesign.Cache.policies.LRUEvictionPolicy;
import SimpleCacheDesign.Cache.storage.HashMapBasedStorage;

public class CacheFactory<Key, Value> {

    public Cache<Key, Value> defaultCache(final int capacity) {
        return new Cache<Key, Value>(new LRUEvictionPolicy<Key>(),
                new HashMapBasedStorage<Key, Value>(capacity));
    }
}