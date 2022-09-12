package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;


public class FirstTest {
    @Test
    void shouldOpen() {
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
       LocalDate localDate = LocalDate.parse("28.10.2020", formatter);

       assertEquals(DayOfWeek.SATURDAY, localDate.getDayOfWeek());
    }
}
