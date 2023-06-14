package com.mehmet.productservice.response;

import lombok.Builder;
import lombok.Data;

import java.security.SecureRandom;

@Data
@Builder
public class FriendlyMessage // exception handleing veya controller da succes messajı alırken ınternalResponse Classsını kullanacağız
{
    private  String title; // error succes gibi mesajları içerir
    private String description; // product not creted veya product succesfully created gibi hatanın veya başarılı olan içerir
    private String buttonPositive; //buttonun durumu UI da kullanılır



}
