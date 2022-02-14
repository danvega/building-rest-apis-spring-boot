package dev.danvega.streamsschedule.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class LiveStreamTest {

    @Test
    void create_new_mutable_live_stream() {
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building REST APIs with Spring Boot");
        stream.setDescription("""
                Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations. 
                But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in 
                developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                """);
        stream.setUrl("https://www.twtich.tv/danvega");
        stream.setStartDate(LocalDateTime.of(2022, 2, 16, 11, 0));
        stream.setEndDate(LocalDateTime.of(2022, 2, 16, 12, 0));

        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.getTitle(), "Title is incorrect");
    }

    @Test
    void create_new_immutable_live_stream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                           Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations. 
                           But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in 
                           developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                        """,
                "https://www.twtich.tv/danvega",
                LocalDateTime.of(2022, 2, 16, 11, 0),
                LocalDateTime.of(2022, 2, 16, 12, 0));

        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot", stream.getTitle(), "Title is incorrect");
    }

    @Test
    void create_new_record_live_stream() {
        LiveStream stream = new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                    Spring Boot is very convenient to use when building REST APIs; it allows you to start with minimal configurations. 
                    But there’s always room for trouble to creep in. Join us for the next IntelliJ IDEA Live Stream to learn how best to avoid this trouble in 
                    developing your project. During the February show, Dan Vega will show us how to make sure we’re following good practices when working with Spring Initializr.
                 """,
                "https://www.twtich.tv/danvega",
                LocalDateTime.of(2022,2,16,11,0),
                LocalDateTime.of(2022,2,16,12,0)
        );

        assertNotNull(stream);
        assertEquals("Building REST APIs with Spring Boot",stream.title());
        assertTrue(stream.getClass().isRecord());
        assertEquals(6,stream.getClass().getRecordComponents().length);
    }

}