/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iskandar.examples.project_management.jsf.breadcrumb;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author iskandar
 */
public class ProjectsItem extends BaseItem {

    public ProjectsItem() {
        super("projects");
    }

    @Override
    protected String createLabel() {
        return "Projects";
    }


    
}
