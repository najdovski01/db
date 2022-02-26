package com.example.db.model.WorksAs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name="works_as")
@NoArgsConstructor
@AllArgsConstructor
public class WorksAs {

    @EmbeddedId
    private WorksAsCompositeKey worksAsCompositeKey;

    ZonedDateTime works_from;
    ZonedDateTime works_to;

    public WorksAsCompositeKey getWorksAsCompositeKey() {
        return worksAsCompositeKey;
    }

    public void setWorksAsCompositeKey(WorksAsCompositeKey worksAsCompositeKey) {
        this.worksAsCompositeKey = worksAsCompositeKey;
    }

    public ZonedDateTime getWorks_from() {
        return works_from;
    }

    public void setWorks_from(ZonedDateTime works_from) {
        this.works_from = works_from;
    }

    public ZonedDateTime getWorks_to() {
        return works_to;
    }

    public void setWorks_to(ZonedDateTime works_to) {
        this.works_to = works_to;
    }
}