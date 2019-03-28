package com.awake.net.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 序列化异常
 * @author hui.zhou 2019/3
 */
@Setter
@Getter
public class SerializeException extends RuntimeException {
    private String errorMessage;
    private Throwable clause;

    public SerializeException(){
        super();
    }

    public SerializeException(String errorMessage, Throwable clause){
        super(errorMessage, clause);
        this.errorMessage = errorMessage;
        this.clause = clause;
    }
}
