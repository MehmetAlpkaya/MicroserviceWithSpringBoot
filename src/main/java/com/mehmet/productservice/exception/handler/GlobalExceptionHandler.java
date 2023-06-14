package com.mehmet.productservice.exception.handler;


import com.mehmet.productservice.exception.enums.FriendlyMessageCode;
import com.mehmet.productservice.exception.exceptions.ProductNotCreatedException;
import com.mehmet.productservice.exception.utils.FriendlyMessageUtils;
import com.mehmet.productservice.response.FriendlyMessage;
import com.mehmet.productservice.response.InternalApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;

@RestControllerAdvice //exception handleing yapabilmek  exception handler tek bir genel hata kpmpanentinde birleştirmeyi sağlar
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ProductNotCreatedException.class)
    public InternalApiResponse<String> handlerProductNotCreatedException(ProductNotCreatedException exception){
        return InternalApiResponse.<String>builder()
                .friendlyMessage(FriendlyMessage.builder()
                    .title(FriendlyMessageUtils.getFriendlyMessage(exception.getLanguage(), FriendlyMessageCode.ERROR))
                    .description(FriendlyMessageUtils.getFriendlyMessage(exception.getLanguage(), exception.getFriendlyMessageCode()))
                    .build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessages(Collections.singletonList(exception.getMessage()))
                .build();


    }
}
