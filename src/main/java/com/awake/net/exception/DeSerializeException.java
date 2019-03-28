package com.awake.net.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 反序列化异常
 * @author hui.zhou 2019/3
 */
@Setter
@Getter
public class DeSerializeException extends RuntimeException {
    private String errorMessage;
    private Throwable clause;

    public DeSerializeException(){
        super();
    }

    public DeSerializeException(String errorMessage, Throwable clause){
        super(errorMessage, clause);
        this.errorMessage = errorMessage;
        this.clause = clause;
    }
}
