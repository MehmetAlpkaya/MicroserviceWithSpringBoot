package com.mehmet.productservice.exception.exceptions;

import com.mehmet.productservice.enums.Language;
import com.mehmet.productservice.exception.enums.IFriendlyMessageCode;
import com.mehmet.productservice.exception.utils.FriendlyMessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ProductNotCreatedException extends RuntimeException // serviste product'a gönderdiğimiz request'in eklenememe durumu unchacked exceptions olduğu için

{
    private final Language language;
    private final IFriendlyMessageCode friendlyMessageCode;

    public ProductNotCreatedException(Language language, IFriendlyMessageCode friendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language, friendlyMessageCode));
        this.language = language;
        this.friendlyMessageCode = friendlyMessageCode;
        log.error("[ProductNotCreatedException] -> message: {} developer message: {}",FriendlyMessageUtils.getFriendlyMessage(language, friendlyMessageCode),message );
    }
}
