/*
 *     Copyright 2017 Hewlett-Packard Development Company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.mqm.atrf.alm.services;

/**
 */
public interface AlmRestConstants {

    String ALM_AUTH_XML = "<alm-authentication>\n\t<user>%s</user>\n\t<password>%s</password>\n</alm-authentication>";

    String ALM_REST_AUTHENTICATION = "/authentication-point/alm-authenticate";
    String ALM_REST_SESSION = "/rest/site-session";


    String ALM_REST_DOMAINS = "/rest/domains";
    String ALM_REST_PROJECTS = ALM_REST_DOMAINS + "/%s/projects";
    String ALM_REST_PROJECT = ALM_REST_PROJECTS +"/%s";
    String ALM_REST_PROJECT_ENTITIES_FORMAT = AlmRestConstants.ALM_REST_PROJECT + "/%s";




}
