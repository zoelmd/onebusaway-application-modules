package org.onebusaway.kcmetro2gtfs.handlers;

import org.onebusaway.gtfs.model.IdentityBean;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntityHandler<K extends Serializable, T extends IdentityBean<K>>
    extends InputHandler {

  private Map<K, T> _entitiesById = new HashMap<K, T>();

  public EntityHandler(Class<? extends IdentityBean<?>> entityType,
      String[] fieldNames) {
    super(entityType, fieldNames);
  }

  public boolean containsKey(K key) {
    return _entitiesById.containsKey(key);
  }

  public Set<K> getKeys() {
    return _entitiesById.keySet();
  }

  public Collection<T> getValues() {
    return _entitiesById.values();
  }

  public T getEntity(K key) {
    return _entitiesById.get(key);
  }

  public T removeEntity(K key) {
    return _entitiesById.remove(key);
  }

  @SuppressWarnings("unchecked")
  public void handleEntity(Object bean) {
    IdentityBean<?> entity = (IdentityBean<?>) bean;
    _entitiesById.put((K) entity.getId(), (T) bean);
  }
}