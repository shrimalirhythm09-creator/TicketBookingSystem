package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {

    private String ticket;

    private   String userId;

    private String source;

    private String destination;

    private Date dateOfArrival;

    private Train train;

}
