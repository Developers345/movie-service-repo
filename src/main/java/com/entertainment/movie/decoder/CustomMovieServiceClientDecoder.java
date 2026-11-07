package com.entertainment.movie.decoder;

import com.entertainment.movie.dto.MovieDto;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;

public class CustomMovieServiceClientDecoder implements Decoder {
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        //reading raw response body as InputStream
        InputStream responseBody = response.body().asInputStream();
        return new ObjectMapper().readValue(responseBody, new TypeReference<Object>() {
            @Override public Type getType() { return type; }
        });
    }
}
