/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.services.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author neal
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(rest.services.service.CompaniesFacadeREST.class);
        resources.add(rest.services.service.CompanyFacadeREST.class);
        resources.add(rest.services.service.CompanyToSectorFacadeREST.class);
        resources.add(rest.services.service.IndustriesFacadeREST.class);
        resources.add(rest.services.service.IndustryFacadeREST.class);
        resources.add(rest.services.service.QuotesFacadeREST.class);
        resources.add(rest.services.service.SectorFacadeREST.class);
        resources.add(rest.services.service.SectorsFacadeREST.class);
    }
    
}
