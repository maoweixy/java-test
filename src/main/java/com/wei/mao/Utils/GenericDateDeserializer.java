package com.wei.mao.Utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.base.Strings;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GenericDateDeserializer extends StdDeserializer<LocalDateTime> {

    public GenericDateDeserializer() {
        this(null);
    }

    public GenericDateDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDateTime deserialize(JsonParser jsonparser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        String date = jsonparser.getText();
        if (Strings.isNullOrEmpty(date)) {
            return null;
        }
        if (date.length() > 10) {
            return LocalDateTime.parse(date);
        }
        return LocalDateTime.of(LocalDate.parse(date), LocalTime.MIN);
    }
}
