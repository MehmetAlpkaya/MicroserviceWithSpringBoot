package com.mehmet.productservice.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class InternalApiResponse<T>//restApi için tek tipte bir response yapısı oluşturup her türlü response için kullanabiliriz
    //response, hata mesajı, succes messajını http statusunu gibi ihtiyaç olan allanları içerir
{
    private FriendlyMessage friendlyMessage;
    private T payload;
    private boolean hasError; //error oluşup oluşmadığını tutar
    private List<String> errorMessages; //errorların ne olduğunu içerir
    private HttpStatus httpStatus; //not found, bad requst gibi durumşarı tutar


}
