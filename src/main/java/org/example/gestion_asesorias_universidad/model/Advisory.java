package org.example.gestion_asesorias_universidad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Advisory {

    private String idAdvisory;
    private String nameAdvisory;

    public Advisory(String idAdvisory, String nameAdvisory) {
        this.idAdvisory = idAdvisory;
        this.nameAdvisory = nameAdvisory;
    }

    public Advisory() {
    }
}
