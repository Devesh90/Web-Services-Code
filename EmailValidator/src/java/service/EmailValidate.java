/*
 * This is java web service code for email validation.
 */

package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Devesh
 */
@WebService(serviceName = "EmailValidate")
public class EmailValidate {

    private final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*"
            + "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern = Pattern.compile(emailPattern);
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "validateEmail")
    public String validateEmail(@WebParam(name = "email") String email) {
        
        Matcher matcher = pattern.matcher(email);
        return String.valueOf(matcher.matches());
    }
}
