/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.shared.validator;

import javax.faces.validator.FacesValidator;

/**
 *
 * @author iskandar
 */
@FacesValidator(value = "requiredPassword")
public class RequiredPasswodValidator extends BasePasswordValidator {

    public RequiredPasswodValidator() {
        setRequired(true);
    }
    
}
