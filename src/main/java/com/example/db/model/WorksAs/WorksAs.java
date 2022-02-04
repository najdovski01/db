package com.example.db.model.WorksAs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="works_as")
@NoArgsConstructor
@AllArgsConstructor
public class WorksAs {

    @EmbeddedId
    private WorksAsCompositeKey worksAsCompositeKey;

    String works_from;
    String works_to;

    public WorksAsCompositeKey getWorksAsCompositeKey() {
        return worksAsCompositeKey;
    }

    public void setWorksAsCompositeKey(WorksAsCompositeKey worksAsCompositeKey) {
        this.worksAsCompositeKey = worksAsCompositeKey;
    }

    public String getWorks_from() {
        return works_from;
    }

    public void setWorks_from(String works_from) {
        this.works_from = works_from;
    }

    public String getWorks_to() {
        return works_to;
    }

    public void setWorks_to(String works_to) {
        this.works_to = works_to;
    }
}
