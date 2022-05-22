package org.mybatis.jpetstore.EventStore;

import org.junit.jupiter.api.Test;
import org.mybatis.jpetstore.event.IEvent;
import org.mybatis.jpetstore.store.IEventStore;
import org.mybatis.jpetstore.store.EventStore;

public class EventStoreTest {
    @Test
    void appendToStream(){
        IEventStore eventStore = new EventStore();
    }
}
