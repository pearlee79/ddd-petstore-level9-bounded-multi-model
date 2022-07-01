package com.example.petstore.domain;

//import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
//import javax.persistence.OneToMany;


@Entity
public class PartyInfo {

    @Id  @GeneratedValue
    Long id;
    PartyStatus partyStatus;
    String driver;
    String startPlace;
    String endPlace;
    String price;

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }


    @OneToMany
    List<Member> partyMembers;
        public List<Member> getPartyMembers() {
            return partyMembers;
        }
        public void setPartyMembers(List<Member> partyMembers) {
            this.partyMembers = partyMembers;
        }

}