/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 *
 * @author id835238
 */
public class Activator implements BundleActivator {

	ServiceRegistration<UserResource> serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		this.serviceRegistration = bundleContext.registerService(UserResource.class, new UserResource(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		this.serviceRegistration.unregister();
	}

}
