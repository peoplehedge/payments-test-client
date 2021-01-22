/*
 * PaymentsAPI
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bankanovafx.payments.api;

import java.util.HashMap;
import java.util.Map;

import com.bankanovafx.payments.api.models.*;

public class Configuration {
    //API Key
    //TODO: Replace the xApiKey with an appropriate value
    public static String xApiKey = "";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.API;

    /**
     *  basePath value
     */
    public static String basePath = "v1";

    /**
     *  Environment - [payments, paymentsqa, paymentsprod]
     */
    public static String env = "payments";

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentMapper(Configuration.environment, server));
        Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("basePath", Configuration.basePath);
		parameters.put("env", Configuration.env);
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.ENUM_DEFAULT);
    }
    
    /**
     * Base URLs by environments and server aliases 
     */

    private static String environmentMapper(Environments environments, Servers servers) {
		String url = "";
		if(environments.equals(Environments.API)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://api.{env}.bankanovafx.com/{basePath}";
		}
		return url;
	}
}
