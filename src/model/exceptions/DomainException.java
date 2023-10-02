package model.exceptions;

import java.io.Serial;

// O runtime não obriga você a tratar os erros, diferente do exception
//  isso quem faz e o compilador
public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }

}
