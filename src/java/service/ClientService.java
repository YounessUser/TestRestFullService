/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import restfulService.RestFullServiceClient;
import bean.Client;

/**
 *
 * @author youness
 */
public class ClientService {
    
    RestFullServiceClient client = new RestFullServiceClient();
    
    public void getAllClients(){
        System.out.println(client.findAll(Client.class));
    }
    
    public void getOneClients(){
        System.out.println(client.find_JSON(Client.class, ""));
    }
    
}
