package com.rentamaquina.maquinaria.app.reports;

import com.rentamaquina.maquinaria.app.entities.Client;

/**
 *
 * @author ---------------
 */
public class CountClient {

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public Client getClient() {
        return client;
    }
    private Long total;
    private Client client;

    public CountClient(Long total, Client client) {
        this.total = total;
        this.client = client;
    }

    
    

}
