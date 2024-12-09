package com.mynt.Movies.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class MovieServiceImplTest {
    MovieService service = new MovieServiceImpl();

    @Test
    @WithMockUser("admin")
    public void testGetSecurityPositive(){
        assertNotNull(service.getSecurity());
    }

    @Test
    public void testGetSecurityNegative(){
        assertEquals("null",service.getSecurity());
    }
}
